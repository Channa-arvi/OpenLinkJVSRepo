package com.customer;

import com.garinternal.common.util.GarLogger;
import com.olf.embedded.application.EnumScriptCategory;
import com.olf.embedded.application.ScriptCategory;
import com.olf.embedded.generic.AbstractGenericScript;
import com.olf.openjvs.OException;
import com.olf.openjvs.PluginCategory;
import com.olf.openjvs.PluginType;
import com.olf.openjvs.Table;
import com.olf.openjvs.enums.SCRIPT_CATEGORY_ENUM;
import com.olf.openjvs.enums.SCRIPT_TYPE_ENUM;

@ScriptCategory({ EnumScriptCategory.Generic })
@PluginCategory(SCRIPT_CATEGORY_ENUM.SCRIPT_CAT_GENERIC)
@PluginType(SCRIPT_TYPE_ENUM.MAIN_SCRIPT)// TODO select script type here)

public class SimpleJVSScript1 extends AbstractGenericScript {
    private GarLogger logger;

    /**
     * Constructor
     *
     * @throws OException {@link OException}
     */
    public SimpleJVSScript1() throws OException {
        super();
        // this.logger = super.getLoggerInstance();
    }

    public void execute(Table argt, Table returnt) throws OException {
        // TODO: Start writing code here
    }
}
