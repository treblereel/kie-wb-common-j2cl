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

package org.kie.workbench.common.dmn.client.editors.included;

import javax.inject.Inject;

import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import elemental2.dom.MouseEvent;
import org.kie.workbench.common.dmn.client.editors.common.RemoveHelper;
import org.treblereel.gwt.crysknife.annotation.DataField;
import org.treblereel.gwt.crysknife.annotation.EventHandler;
import org.treblereel.gwt.crysknife.annotation.ForEvent;
import org.treblereel.gwt.crysknife.annotation.Templated;

@Templated
public class IncludedModelsPageView implements IncludedModelsPagePresenter.View {

    @DataField("grid")
    private final HTMLDivElement grid;

    @DataField("include-model")
    private final HTMLButtonElement includeModelButton;

    private IncludedModelsPagePresenter presenter;

    @Inject
    public IncludedModelsPageView(final HTMLDivElement grid,
                                  final HTMLButtonElement includeModelButton) {
        this.grid = grid;
        this.includeModelButton = includeModelButton;
    }

    @Override
    public void init(final IncludedModelsPagePresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setGrid(final HTMLElement grid) {
        RemoveHelper.removeChildren(this.grid);
        this.grid.appendChild(grid);
    }

    @EventHandler("include-model")
    public void onIncludeModelButtonClick(@ForEvent("click") final MouseEvent event) {
        presenter.openIncludeModelModal();
    }
}
