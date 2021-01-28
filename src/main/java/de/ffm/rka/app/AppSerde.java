package de.ffm.rka.app;

import de.ffm.rka.DeliveryAddress;
import de.ffm.rka.PosInvoice;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;

import java.util.HashMap;
import java.util.Map;

public class AppSerde extends Serdes {

    public static final class PosInvoiceSerde extends WrapperSerde<PosInvoice>{

        public PosInvoiceSerde(){
            super(new JsonSerializer<PosInvoice>(), new JsonDeserializer<PosInvoice>());
        }
    }

    public static Serde<PosInvoice> posInvoice(){
        PosInvoiceSerde posInvoiceSerde = new PosInvoiceSerde();
        Map<String, Object> serdesConfig = new HashMap<String, Object>();
        serdesConfig.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, PosInvoice.class);
        posInvoiceSerde.configure(serdesConfig, false);
        return posInvoiceSerde;
    }

    public static final class DeliveryAddresseSerde extends WrapperSerde<DeliveryAddress>{

        public DeliveryAddresseSerde(){
            super(new JsonSerializer<DeliveryAddress>(), new JsonDeserializer<DeliveryAddress>());
        }
    }

    public static Serde<DeliveryAddress> deliveryAddressSerde(){
        DeliveryAddresseSerde deliveryAddressSerde = new DeliveryAddresseSerde();
        Map<String, Object> serdesConfig = new HashMap<String, Object>();
        serdesConfig.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, DeliveryAddress.class);
        deliveryAddressSerde.configure(serdesConfig, false);
        return deliveryAddressSerde;
    }
}
