package model.auxiliar;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "cart_row")
public class OrderSlipDetail {

	private Long id_product;
	private Long id_order_detail;
	private float product_quantity;
	private float amount_tax_excl;
	private float amount_tax_incl;
	
	public OrderSlipDetail() {
		super();
	}

	public Long getId_product() {
		return id_product;
	}

	public void setId_product(Long id_product) {
		this.id_product = id_product;
	}

	public Long getId_order_detail() {
		return id_order_detail;
	}

	public void setId_order_detail(Long id_order_detail) {
		this.id_order_detail = id_order_detail;
	}

	public float getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(float product_quantity) {
		this.product_quantity = product_quantity;
	}

	public float getAmount_tax_excl() {
		return amount_tax_excl;
	}

	public void setAmount_tax_excl(float amount_tax_excl) {
		this.amount_tax_excl = amount_tax_excl;
	}

	public float getAmount_tax_incl() {
		return amount_tax_incl;
	}

	public void setAmount_tax_incl(float amount_tax_incl) {
		this.amount_tax_incl = amount_tax_incl;
	}

	@Override
	public String toString() {
		return "OrderSlipDetail [id_product=" + id_product + ", id_order_detail=" + id_order_detail
				+ ", product_quantity=" + product_quantity + ", amount_tax_excl=" + amount_tax_excl
				+ ", amount_tax_incl=" + amount_tax_incl + "]";
	}	
	

}
