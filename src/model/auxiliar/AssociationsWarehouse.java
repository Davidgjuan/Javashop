package model.auxiliar;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Carrier;
import model.Shop;
import model.Stock;

@JacksonXmlRootElement(localName = "associations")
public class AssociationsWarehouse {

	
	@JacksonXmlElementWrapper(namespace ="stocks", localName = "stocks")
	private List<Stock> stock;
	
	@JacksonXmlElementWrapper(namespace ="carriers", localName = "carriers")
	private List<Carrier> carrier;
	@JacksonXmlElementWrapper(namespace ="shops", localName = "shops")
	private List<Shop> shop;
	

	public AssociationsWarehouse() {
		super();
	}


	public List<Stock> getStock() {
		return stock;
	}


	public void setStock(List<Stock> stock) {
		this.stock = stock;
	}


	public List<Carrier> getCarrier() {
		return carrier;
	}


	public void setCarrier(List<Carrier> carrier) {
		this.carrier = carrier;
	}


	public List<Shop> getShop() {
		return shop;
	}


	public void setShop(List<Shop> shop) {
		this.shop = shop;
	}


	@Override
	public String toString() {
		return "AssociationsWarehouse [stock=" + stock + ", carrier=" + carrier + ", shop=" + shop + "]";
	}

	

}
