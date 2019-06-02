/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.dmn.client.editors.included.modal;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLInputElement;
import elemental2.dom.KeyboardEvent;
import elemental2.dom.MouseEvent;
import org.treblereel.gwt.crysknife.annotation.DataField;
import org.treblereel.gwt.crysknife.annotation.EventHandler;
import org.treblereel.gwt.crysknife.annotation.ForEvent;
import org.treblereel.gwt.crysknife.annotation.Templated;

@Dependent
@Templated
public class IncludedModelModalView implements IncludedModelModal.View {

    @DataField("header")
    HTMLDivElement header;

    @DataField("body")
    HTMLDivElement body;

    @DataField("footer")
    HTMLDivElement footer;

    @DataField("dropdown")
    HTMLDivElement dropdown;

    @DataField("model-name")
    HTMLInputElement modelNameInput;

    @DataField("include")
    HTMLButtonElement includeButton;

    @DataField("cancel")
    HTMLButtonElement cancelButton;

    private IncludedModelModal presenter;

    @Inject
    public IncludedModelModalView(final HTMLDivElement header,
                                  final HTMLDivElement body,
                                  final HTMLDivElement footer,
                                  final HTMLDivElement dropdown,
                                  final HTMLInputElement modelNameInput,
                                  final HTMLButtonElement includeButton,
                                  final HTMLButtonElement cancelButton) {
        this.header = header;
        this.body = body;
        this.footer = footer;
        this.dropdown = dropdown;
        this.modelNameInput = modelNameInput;
        this.includeButton = includeButton;
        this.cancelButton = cancelButton;
    }

    @Override
    public void init(final IncludedModelModal presenter) {
        this.presenter = presenter;
    }

    @Override
    public void initialize() {
        modelNameInput.value = "";
    }

    @Override
    public String getHeader() {
        return header.textContent;
    }

    @Override
    public HTMLElement getBody() {
        return body;
    }

    @Override
    public HTMLElement getFooter() {
        return footer;
    }

    @Override
    public String getModelNameInput() {
        return modelNameInput.value;
    }

    @Override
    public void setupAssetsDropdown(final HTMLElement dropdownElement) {
        dropdown.appendChild(dropdownElement);
    }

    @Override
    public void disableIncludeButton() {
        includeButton.disabled = true;
    }

    @Override
    public void enableIncludeButton() {
        includeButton.disabled = false;
    }

    @EventHandler("model-name")
    public void onModelNameInputChanged(@ForEvent("onkeyup") final KeyboardEvent e) {
        presenter.onValueChanged();
    }

    @EventHandler("include")
    public void onIncludeButtonClick(@ForEvent("click") final MouseEvent e) {
        presenter.include();
    }

    @EventHandler("cancel")
    public void onCancelButtonClick(@ForEvent("click") final MouseEvent e) {
        presenter.hide();
    }
}
