package com.mycompany.designpatterns.factory.factory_method.logistics_example.creator;

import com.mycompany.designpatterns.factory.factory_method.logistics_example.product.Transport;

public abstract class TransportLogistics {

    public abstract Transport createLogistic(String type);
}
