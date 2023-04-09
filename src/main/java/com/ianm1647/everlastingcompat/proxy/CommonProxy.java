package com.ianm1647.everlastingcompat.proxy;

import com.ianm1647.everlastingcompat.EverlastingCompat;
import org.cyclops.cyclopscore.init.ModBase;
import org.cyclops.cyclopscore.proxy.CommonProxyComponent;

public class CommonProxy extends CommonProxyComponent {

    @Override
    public ModBase getMod() {
        return EverlastingCompat._instance;
    }

}
