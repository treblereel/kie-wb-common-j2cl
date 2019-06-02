/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
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

package org.kie.workbench.common.dmn.client.graph;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.kie.workbench.common.stunner.core.diagram.Diagram;

@Dependent
public class DMNGraphUtils {

    private static Diagram NO_DIAGRAM = null;

    public DMNGraphUtils() {
        //CDI proxy
    }

    @Inject
    public DMNGraphUtils(final SessionManager sessionManager,
                         final DMNDiagramUtils dmnDiagramUtils) {
        this.sessionManager = sessionManager;
        this.dmnDiagramUtils = dmnDiagramUtils;
    }

    public Definitions getDefinitions() {
        return getCurrentSession()
                .map(clientSession -> {
                    return getCanvasHandler(clientSession)
                            .map(canvasHandler -> dmnDiagramUtils.getDefinitions(canvasHandler.getDiagram()))
                            .orElse(NO_DEFINITIONS);
                })
                .orElse(NO_DEFINITIONS);
    }

}
