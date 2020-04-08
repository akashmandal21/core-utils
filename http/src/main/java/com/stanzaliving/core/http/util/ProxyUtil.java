package com.stanzaliving.core.http.util;

import com.sun.deploy.net.proxy.ProxyConfigException;
import lombok.experimental.UtilityClass;

import java.net.*;

/**
 * @author piyush srivastava
 *
 * @date 08-Apr-2020
 *
 */


@UtilityClass
public class ProxyUtil {

    public Proxy getProxy(String proxy) throws UnknownHostException, ProxyConfigException {
        String[] tempProxy = proxy.split(":");
        if(tempProxy.length < 2){
            throw new ProxyConfigException("Invalid proxy details");
        }
        InetAddress address = InetAddress.getByName(tempProxy[0]);
        SocketAddress socketAddress = new InetSocketAddress(address, Integer.parseInt(tempProxy[1]));
        return new Proxy(Proxy.Type.HTTP, socketAddress);
    }
}

