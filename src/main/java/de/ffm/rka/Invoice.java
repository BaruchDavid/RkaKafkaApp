package de.ffm.rka;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "InvoiceNumber",
    "CustomerCardNo",
    "TotalAmount",
    "NumberOfItem",
    "PaymentMethod",
    "TaxableAmount",
    "CGST",
    "SGCT",
    "CESS",
    "InvoiceLineItems"
})
public class Invoice {

    @JsonProperty("InvoiceNumber")
    private Long invoiceNumber;
    @JsonProperty("CustomerCardNo")
    private String customerCardNo;
    @JsonProperty("TotalAmount")
    private Double totalAmount;
    @JsonProperty("NumberOfItem")
    private Integer numberOfItem;
    @JsonProperty("PaymentMethod")
    private String paymentMethod;
    @JsonProperty("TaxableAmount")
    private Double taxableAmount;
    @JsonProperty("CGST")
    private Double cGST;
    @JsonProperty("SGCT")
    private Double sGCT;
    @JsonProperty("CESS")
    private Double cESS;
    @JsonProperty("InvoiceLineItems")
    private List<Object> invoiceLineItems = new ArrayList<Object>();

    @JsonProperty("InvoiceNumber")
    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    @JsonProperty("InvoiceNumber")
    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Invoice withInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    @JsonProperty("CustomerCardNo")
    public String getCustomerCardNo() {
        return customerCardNo;
    }

    @JsonProperty("CustomerCardNo")
    public void setCustomerCardNo(String customerCardNo) {
        this.customerCardNo = customerCardNo;
    }

    public Invoice withCustomerCardNo(String customerCardNo) {
        this.customerCardNo = customerCardNo;
        return this;
    }

    @JsonProperty("TotalAmount")
    public Double getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("TotalAmount")
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Invoice withTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    @JsonProperty("NumberOfItem")
    public Integer getNumberOfItem() {
        return numberOfItem;
    }

    @JsonProperty("NumberOfItem")
    public void setNumberOfItem(Integer numberOfItem) {
        this.numberOfItem = numberOfItem;
    }

    public Invoice withNumberOfItem(Integer numberOfItem) {
        this.numberOfItem = numberOfItem;
        return this;
    }

    @JsonProperty("PaymentMethod")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("PaymentMethod")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Invoice withPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    @JsonProperty("TaxableAmount")
    public Double getTaxableAmount() {
        return taxableAmount;
    }

    @JsonProperty("TaxableAmount")
    public void setTaxableAmount(Double taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    public Invoice withTaxableAmount(Double taxableAmount) {
        this.taxableAmount = taxableAmount;
        return this;
    }

    @JsonProperty("CGST")
    public Double getCGST() {
        return cGST;
    }

    @JsonProperty("CGST")
    public void setCGST(Double cGST) {
        this.cGST = cGST;
    }

    public Invoice withCGST(Double cGST) {
        this.cGST = cGST;
        return this;
    }

    @JsonProperty("SGCT")
    public Double getSGCT() {
        return sGCT;
    }

    @JsonProperty("SGCT")
    public void setSGCT(Double sGCT) {
        this.sGCT = sGCT;
    }

    public Invoice withSGCT(Double sGCT) {
        this.sGCT = sGCT;
        return this;
    }

    @JsonProperty("CESS")
    public Double getCESS() {
        return cESS;
    }

    @JsonProperty("CESS")
    public void setCESS(Double cESS) {
        this.cESS = cESS;
    }

    public Invoice withCESS(Double cESS) {
        this.cESS = cESS;
        return this;
    }

    @JsonProperty("InvoiceLineItems")
    public List<Object> getInvoiceLineItems() {
        return invoiceLineItems;
    }

    @JsonProperty("InvoiceLineItems")
    public void setInvoiceLineItems(List<Object> invoiceLineItems) {
        this.invoiceLineItems = invoiceLineItems;
    }

    public Invoice withInvoiceLineItems(List<Object> invoiceLineItems) {
        this.invoiceLineItems = invoiceLineItems;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("invoiceNumber", invoiceNumber).append("customerCardNo", customerCardNo).append("totalAmount", totalAmount).append("numberOfItem", numberOfItem).append("paymentMethod", paymentMethod).append("taxableAmount", taxableAmount).append("cGST", cGST).append("sGCT", sGCT).append("cESS", cESS).append("invoiceLineItems", invoiceLineItems).toString();
    }

}
