/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.client.views.pfly.multipage;

import org.jboss.gwt.elemento.core.IsElement;
import org.uberfire.client.workbench.widgets.multipage.PageView;

public class PageViewImpl implements PageView {

    private final PageImpl presenter;

    public PageViewImpl(PageImpl presenter,
                        IsElement widget) {
        this.presenter = presenter;
    }
}
