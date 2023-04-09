package com.ianm1647.everlastingcompat.proxy;

import com.ianm1647.everlastingcompat.EverlastingCompat;
import org.cyclops.cyclopscore.init.ModBase;
import org.cyclops.cyclopscore.proxy.ClientProxyComponent;

public class ClientProxy extends ClientProxyComponent {

    public ClientProxy() {
        super(new CommonProxy());
    }

    @Override
    public ModBase getMod() {
        return EverlastingCompat._instance;
    }

}
