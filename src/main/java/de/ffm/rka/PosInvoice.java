
package de.ffm.rka;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "StoreID:",
    "PosID",
    "CustomerType",
    "DeliveryType",
    "DelieryAddress"
})
public class PosInvoice
    extends Invoice
{

    @JsonProperty("StoreID:")
    private String storeID;
    @JsonProperty("PosID")
    private String posID;
    @JsonProperty("CustomerType")
    private String customerType;
    @JsonProperty("DeliveryType")
    private String deliveryType;
    @JsonProperty("DelieryAddress")
    private DeliveryAddress delieryAddress;

    @JsonProperty("StoreID:")
    public String getStoreID() {
        return storeID;
    }

    @JsonProperty("StoreID:")
    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public PosInvoice withStoreID(String storeID) {
        this.storeID = storeID;
        return this;
    }

    @JsonProperty("PosID")
    public String getPosID() {
        return posID;
    }

    @JsonProperty("PosID")
    public void setPosID(String posID) {
        this.posID = posID;
    }

    public PosInvoice withPosID(String posID) {
        this.posID = posID;
        return this;
    }

    @JsonProperty("CustomerType")
    public String getCustomerType() {
        return customerType;
    }

    @JsonProperty("CustomerType")
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public PosInvoice withCustomerType(String customerType) {
        this.customerType = customerType;
        return this;
    }

    @JsonProperty("DeliveryType")
    public String getDeliveryType() {
        return deliveryType;
    }

    @JsonProperty("DeliveryType")
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public PosInvoice withDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }

    @JsonProperty("DelieryAddress")
    public DeliveryAddress getDelieryAddress() {
        return delieryAddress;
    }

    @JsonProperty("DelieryAddress")
    public void setDelieryAddress(DeliveryAddress delieryAddress) {
        this.delieryAddress = delieryAddress;
    }

    public PosInvoice withDelieryAddress(DeliveryAddress delieryAddress) {
        this.delieryAddress = delieryAddress;
        return this;
    }

    @Override
    public PosInvoice withInvoiceNumber(Long invoiceNumber) {
        super.withInvoiceNumber(invoiceNumber);
        return this;
    }

    @Override
    public PosInvoice withCustomerCardNo(String customerCardNo) {
        super.withCustomerCardNo(customerCardNo);
        return this;
    }

    @Override
    public PosInvoice withTotalAmount(Double totalAmount) {
        super.withTotalAmount(totalAmount);
        return this;
    }

    @Override
    public PosInvoice withNumberOfItem(Integer numberOfItem) {
        super.withNumberOfItem(numberOfItem);
        return this;
    }

    @Override
    public PosInvoice withPaymentMethod(String paymentMethod) {
        super.withPaymentMethod(paymentMethod);
        return this;
    }

    @Override
    public PosInvoice withTaxableAmount(Double taxableAmount) {
        super.withTaxableAmount(taxableAmount);
        return this;
    }

    @Override
    public PosInvoice withCGST(Double cGST) {
        super.withCGST(cGST);
        return this;
    }

    @Override
    public PosInvoice withSGCT(Double sGCT) {
        super.withSGCT(sGCT);
        return this;
    }

    @Override
    public PosInvoice withCESS(Double cESS) {
        super.withCESS(cESS);
        return this;
    }

    @Override
    public PosInvoice withInvoiceLineItems(List<Object> invoiceLineItems) {
        super.withInvoiceLineItems(invoiceLineItems);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("storeID", storeID).append("posID", posID).append("customerType", customerType).append("deliveryType", deliveryType).append("delieryAddress", delieryAddress).toString();
    }

}
