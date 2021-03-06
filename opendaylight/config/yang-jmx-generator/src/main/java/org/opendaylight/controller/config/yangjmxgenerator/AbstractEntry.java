/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.config.yangjmxgenerator;

/**
 * Base for entries that provides information about their yang source.
 */
public class AbstractEntry {

    private String yangModuleName;
    private String yangModuleLocalname;

    public AbstractEntry() {
    }

    protected void setYangModuleName(String name) {
        this.yangModuleName = name;
    }

    public String getYangModuleLocalname() {
        return yangModuleLocalname;
    }

    protected void setYangModuleLocalname(String yangModuleLocalname) {
        this.yangModuleLocalname = yangModuleLocalname;
    }

    public String getYangModuleName() {
        return yangModuleName;
    }

}
