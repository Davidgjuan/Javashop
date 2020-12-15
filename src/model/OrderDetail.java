package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.AssociationsOrderDetail;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "order_detail")
public class OrderDetail implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private String id;
	private String id_order;
	private String product_id;
	private String product_attribute_id;
	private int product_quantity_reinjected;
	private float group_reduction;
	private int discount_quantity_applied;
	private String download_hash;
	private String download_deadline;
	private long id_order_invoice;
	private long id_warehouse;
	private long id_shop;
	private long id_customization;
	private String product_name;
	private int product_quantity;
	private int product_quantity_in_stock;
	private int product_quantity_return;
	private int product_quantity_refunded;
	private float product_price;
	private float reduction_percent;
	private float reduction_amount;
	private float reduction_amount_tax_incl;
	private float reduction_amount_tax_excl;
	private float product_quantity_discount;
	private String product_ean13;
	private String product_isbn;
	private String product_upc;
	private String product_mpn;
	private String product_reference;
	private String product_supplier_reference;
	private float product_weight;
	private String tax_computation_method;
	private int id_tax_rules_group;
	private float ecotax;
	private float ecotax_tax_rate;
	private float download_nb;
	private float unit_price_tax_incl;
	private float unit_price_tax_excl;
	private float total_price_tax_incl;
	private float total_price_tax_excl;
	private float total_shipping_price_tax_excl;
	private float total_shipping_price_tax_incl;
	private float purchase_supplier_price;
	private float original_product_price;
	private float original_wholesale_price;
	private float total_refunded_tax_excl;
	private float total_refunded_tax_incl;
	private AssociationsOrderDetail associations;
	 
	private static final long serialVersionUID = 3916167748882494558L;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId_order() {
		return id_order;
	}

	public void setId_order(String id_order) {
		this.id_order = id_order;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_attribute_id() {
		return product_attribute_id;
	}

	public void setProduct_attribute_id(String product_attribute_id) {
		this.product_attribute_id = product_attribute_id;
	}

	public int getProduct_quantity_reinjected() {
		return product_quantity_reinjected;
	}

	public void setProduct_quantity_reinjected(int product_quantity_reinjected) {
		this.product_quantity_reinjected = product_quantity_reinjected;
	}

	public float getGroup_reduction() {
		return group_reduction;
	}

	public void setGroup_reduction(float group_reduction) {
		this.group_reduction = group_reduction;
	}

	public int getDiscount_quantity_applied() {
		return discount_quantity_applied;
	}

	public void setDiscount_quantity_applied(int discount_quantity_applied) {
		this.discount_quantity_applied = discount_quantity_applied;
	}

	public String getDownload_hash() {
		return download_hash;
	}

	public void setDownload_hash(String download_hash) {
		this.download_hash = download_hash;
	}

	public String getDownload_deadline() {
		return download_deadline;
	}

	public void setDownload_deadline(String download_deadline) {
		this.download_deadline = download_deadline;
	}

	public long getId_order_invoice() {
		return id_order_invoice;
	}

	public void setId_order_invoice(long id_order_invoice) {
		this.id_order_invoice = id_order_invoice;
	}

	public long getId_warehouse() {
		return id_warehouse;
	}

	public void setId_warehouse(long id_warehouse) {
		this.id_warehouse = id_warehouse;
	}

	public long getId_shop() {
		return id_shop;
	}

	public void setId_shop(long id_shop) {
		this.id_shop = id_shop;
	}

	public long getId_customization() {
		return id_customization;
	}

	public void setId_customization(long id_customization) {
		this.id_customization = id_customization;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	public int getProduct_quantity_in_stock() {
		return product_quantity_in_stock;
	}

	public void setProduct_quantity_in_stock(int product_quantity_in_stock) {
		this.product_quantity_in_stock = product_quantity_in_stock;
	}

	public int getProduct_quantity_return() {
		return product_quantity_return;
	}

	public void setProduct_quantity_return(int product_quantity_return) {
		this.product_quantity_return = product_quantity_return;
	}

	public int getProduct_quantity_refunded() {
		return product_quantity_refunded;
	}

	public void setProduct_quantity_refunded(int product_quantity_refunded) {
		this.product_quantity_refunded = product_quantity_refunded;
	}

	public float getProduct_price() {
		return product_price;
	}

	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}

	public float getReduction_percent() {
		return reduction_percent;
	}

	public void setReduction_percent(float reduction_percent) {
		this.reduction_percent = reduction_percent;
	}

	public float getReduction_amount() {
		return reduction_amount;
	}

	public void setReduction_amount(float reduction_amount) {
		this.reduction_amount = reduction_amount;
	}

	public float getReduction_amount_tax_incl() {
		return reduction_amount_tax_incl;
	}

	public void setReduction_amount_tax_incl(float reduction_amount_tax_incl) {
		this.reduction_amount_tax_incl = reduction_amount_tax_incl;
	}

	public float getReduction_amount_tax_excl() {
		return reduction_amount_tax_excl;
	}

	public void setReduction_amount_tax_excl(float reduction_amount_tax_excl) {
		this.reduction_amount_tax_excl = reduction_amount_tax_excl;
	}

	public float getProduct_quantity_discount() {
		return product_quantity_discount;
	}

	public void setProduct_quantity_discount(float product_quantity_discount) {
		this.product_quantity_discount = product_quantity_discount;
	}

	public String getProduct_ean13() {
		return product_ean13;
	}

	public void setProduct_ean13(String product_ean13) {
		this.product_ean13 = product_ean13;
	}

	public String getProduct_isbn() {
		return product_isbn;
	}

	public void setProduct_isbn(String product_isbn) {
		this.product_isbn = product_isbn;
	}

	public String getProduct_upc() {
		return product_upc;
	}

	public void setProduct_upc(String product_upc) {
		this.product_upc = product_upc;
	}

	public String getProduct_mpn() {
		return product_mpn;
	}

	public void setProduct_mpn(String product_mpn) {
		this.product_mpn = product_mpn;
	}

	public String getProduct_reference() {
		return product_reference;
	}

	public void setProduct_reference(String product_reference) {
		this.product_reference = product_reference;
	}

	public String getProduct_supplier_reference() {
		return product_supplier_reference;
	}

	public void setProduct_supplier_reference(String product_supplier_reference) {
		this.product_supplier_reference = product_supplier_reference;
	}

	public float getProduct_weight() {
		return product_weight;
	}

	public void setProduct_weight(float product_weight) {
		this.product_weight = product_weight;
	}

	public String getTax_computation_method() {
		return tax_computation_method;
	}

	public void setTax_computation_method(String tax_computation_method) {
		this.tax_computation_method = tax_computation_method;
	}

	public int getId_tax_rules_group() {
		return id_tax_rules_group;
	}

	public void setId_tax_rules_group(int id_tax_rules_group) {
		this.id_tax_rules_group = id_tax_rules_group;
	}

	public float getEcotax() {
		return ecotax;
	}

	public void setEcotax(float ecotax) {
		this.ecotax = ecotax;
	}

	public float getEcotax_tax_rate() {
		return ecotax_tax_rate;
	}

	public void setEcotax_tax_rate(float ecotax_tax_rate) {
		this.ecotax_tax_rate = ecotax_tax_rate;
	}

	public float getDownload_nb() {
		return download_nb;
	}

	public void setDownload_nb(float download_nb) {
		this.download_nb = download_nb;
	}

	public float getUnit_price_tax_incl() {
		return unit_price_tax_incl;
	}

	public void setUnit_price_tax_incl(float unit_price_tax_incl) {
		this.unit_price_tax_incl = unit_price_tax_incl;
	}

	public float getUnit_price_tax_excl() {
		return unit_price_tax_excl;
	}

	public void setUnit_price_tax_excl(float unit_price_tax_excl) {
		this.unit_price_tax_excl = unit_price_tax_excl;
	}

	public float getTotal_price_tax_incl() {
		return total_price_tax_incl;
	}

	public void setTotal_price_tax_incl(float total_price_tax_incl) {
		this.total_price_tax_incl = total_price_tax_incl;
	}

	public float getTotal_price_tax_excl() {
		return total_price_tax_excl;
	}

	public void setTotal_price_tax_excl(float total_price_tax_excl) {
		this.total_price_tax_excl = total_price_tax_excl;
	}

	public float getTotal_shipping_price_tax_excl() {
		return total_shipping_price_tax_excl;
	}

	public void setTotal_shipping_price_tax_excl(float total_shipping_price_tax_excl) {
		this.total_shipping_price_tax_excl = total_shipping_price_tax_excl;
	}

	public float getTotal_shipping_price_tax_incl() {
		return total_shipping_price_tax_incl;
	}

	public void setTotal_shipping_price_tax_incl(float total_shipping_price_tax_incl) {
		this.total_shipping_price_tax_incl = total_shipping_price_tax_incl;
	}

	public float getPurchase_supplier_price() {
		return purchase_supplier_price;
	}

	public void setPurchase_supplier_price(float purchase_supplier_price) {
		this.purchase_supplier_price = purchase_supplier_price;
	}

	public float getOriginal_product_price() {
		return original_product_price;
	}

	public void setOriginal_product_price(float original_product_price) {
		this.original_product_price = original_product_price;
	}

	public float getOriginal_wholesale_price() {
		return original_wholesale_price;
	}

	public void setOriginal_wholesale_price(float original_wholesale_price) {
		this.original_wholesale_price = original_wholesale_price;
	}

	public float getTotal_refunded_tax_excl() {
		return total_refunded_tax_excl;
	}

	public void setTotal_refunded_tax_excl(float total_refunded_tax_excl) {
		this.total_refunded_tax_excl = total_refunded_tax_excl;
	}

	public float getTotal_refunded_tax_incl() {
		return total_refunded_tax_incl;
	}

	public void setTotal_refunded_tax_incl(float total_refunded_tax_incl) {
		this.total_refunded_tax_incl = total_refunded_tax_incl;
	}

	public AssociationsOrderDetail getAssociations() {
		return associations;
	}

	public void setAssociations(AssociationsOrderDetail associations) {
		this.associations = associations;
	}

	@Override
	public String toString() {
		return "OrderDetail [href=" + href + ", id=" + id + ", id_order=" + id_order + ", product_id=" + product_id
				+ ", product_attribute_id=" + product_attribute_id + ", product_quantity_reinjected="
				+ product_quantity_reinjected + ", group_reduction=" + group_reduction + ", discount_quantity_applied="
				+ discount_quantity_applied + ", download_hash=" + download_hash + ", download_deadline="
				+ download_deadline + ", id_order_invoice=" + id_order_invoice + ", id_warehouse=" + id_warehouse
				+ ", id_shop=" + id_shop + ", id_customization=" + id_customization + ", product_name=" + product_name
				+ ", product_quantity=" + product_quantity + ", product_quantity_in_stock=" + product_quantity_in_stock
				+ ", product_quantity_return=" + product_quantity_return + ", product_quantity_refunded="
				+ product_quantity_refunded + ", product_price=" + product_price + ", reduction_percent="
				+ reduction_percent + ", reduction_amount=" + reduction_amount + ", reduction_amount_tax_incl="
				+ reduction_amount_tax_incl + ", reduction_amount_tax_excl=" + reduction_amount_tax_excl
				+ ", product_quantity_discount=" + product_quantity_discount + ", product_ean13=" + product_ean13
				+ ", product_isbn=" + product_isbn + ", product_upc=" + product_upc + ", product_mpn=" + product_mpn
				+ ", product_reference=" + product_reference + ", product_supplier_reference="
				+ product_supplier_reference + ", product_weight=" + product_weight + ", tax_computation_method="
				+ tax_computation_method + ", id_tax_rules_group=" + id_tax_rules_group + ", ecotax=" + ecotax
				+ ", ecotax_tax_rate=" + ecotax_tax_rate + ", download_nb=" + download_nb + ", unit_price_tax_incl="
				+ unit_price_tax_incl + ", unit_price_tax_excl=" + unit_price_tax_excl + ", total_price_tax_incl="
				+ total_price_tax_incl + ", total_price_tax_excl=" + total_price_tax_excl
				+ ", total_shipping_price_tax_excl=" + total_shipping_price_tax_excl
				+ ", total_shipping_price_tax_incl=" + total_shipping_price_tax_incl + ", purchase_supplier_price="
				+ purchase_supplier_price + ", original_product_price=" + original_product_price
				+ ", original_wholesale_price=" + original_wholesale_price + ", total_refunded_tax_excl="
				+ total_refunded_tax_excl + ", total_refunded_tax_incl=" + total_refunded_tax_incl + ", associations="
				+ associations + "]";
	}

}
