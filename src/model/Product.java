package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsProducts;
import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "product")
public class Product implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private Long id_manufacturer;
	private Long id_supplier;
	private String id_category_default;
	@JacksonXmlProperty(namespace = "new",localName = "newProp")
	private String newProp;
	private String cache_default_attribute;
	private String id_default_image;
	private String id_default_combination;
	private String id_tax_rules_group;
	private String position_in_category;
	private String type;
	private Long id_shop_default;
	private String reference;
	private String supplier_reference;
	private String location;
	private Float width;
	private Float height;
	private String quantity;
	private Float depth;
	private Float weight;
	private byte quantity_discount;
	private String ean13;
	private String isbn;
	private String upc;
	private String mpn;
	private String manufacturer_name;
	private byte cache_is_pack;
	private byte cache_has_attachments;
	private byte is_virtual;
	private Long state;
	private Long additional_delivery_times;
	@XmlElementWrapper
	private List<Language> delivery_in_stock;
	@XmlElementWrapper
	private List<Language> delivery_out_stock;
	private byte on_sale;
	private byte online_only;
	private float ecotax;
	private Integer minimal_quantity;
	private int low_stock_threshold;
	private byte low_stock_alert;
	private float price;
	private float wholesale_price;
	private String unity;
	private String unit_price_ratio;
	private float additional_shipping_cost;
	private Integer customizable;
	private Integer text_fields;
	private Integer uploadable_files;
	private byte active;
	private String redirect_type;
	private Long id_type_redirected;
	private byte available_for_order;
	private String available_date;
	private byte show_condition;
	private String condition;
	private byte show_price;
	private byte indexed;
	private String visibility;
	private byte advanced_stock_management;
	private String date_add;
	private String date_upd;
	private Integer pack_stock_type;
	@XmlElementWrapper
	private List<Language> meta_description;
	@XmlElementWrapper
	private List<Language> meta_keywords;
	@XmlElementWrapper
	private List<Language> meta_title;
	@XmlElementWrapper
	private List<Language> link_rewrite;
	@XmlElementWrapper
	private List<Language> name;
	@XmlElementWrapper
	private List<Language> description;
	@XmlElementWrapper
	private List<Language> description_short;
	@XmlElementWrapper
	private List<Language> available_now;
	@XmlElementWrapper
	private List<Language> available_later;

	private AssociationsProducts associations;

	private static final long serialVersionUID = -6632229469726203909L;
	
	public Product() {
		
	}
	
	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_manufacturer() {
		return id_manufacturer;
	}

	public void setId_manufacturer(Long id_manufacturer) {
		this.id_manufacturer = id_manufacturer;
	}

	public Long getId_supplier() {
		return id_supplier;
	}

	public void setId_supplier(Long id_supplier) {
		this.id_supplier = id_supplier;
	}

	public String getId_category_default() {
		return id_category_default;
	}

	public void setId_category_default(String id_category_default) {
		this.id_category_default = id_category_default;
	}

	public String getNew() {
		return newProp;
	}

	public void setNew(String newProp) {
		this.newProp = newProp;
	}

	public String getCache_default_attribute() {
		return cache_default_attribute;
	}

	public void setCache_default_attribute(String cache_default_attribute) {
		this.cache_default_attribute = cache_default_attribute;
	}

	public String getId_default_image() {
		return id_default_image;
	}

	public void setId_default_image(String id_default_image) {
		this.id_default_image = id_default_image;
	}

	public String getId_default_combination() {
		return id_default_combination;
	}

	public void setId_default_combination(String id_default_combination) {
		this.id_default_combination = id_default_combination;
	}

	public String getId_tax_rules_group() {
		return id_tax_rules_group;
	}

	public void setId_tax_rules_group(String id_tax_rules_group) {
		this.id_tax_rules_group = id_tax_rules_group;
	}

	public String getPosition_in_category() {
		return position_in_category;
	}

	public void setPosition_in_category(String position_in_category) {
		this.position_in_category = position_in_category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getId_shop_default() {
		return id_shop_default;
	}

	public void setId_shop_default(Long id_shop_default) {
		this.id_shop_default = id_shop_default;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getSupplier_reference() {
		return supplier_reference;
	}

	public void setSupplier_reference(String supplier_reference) {
		this.supplier_reference = supplier_reference;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Float getWidth() {
		return width;
	}

	public void setWidth(Float width) {
		this.width = width;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Float getDepth() {
		return depth;
	}

	public void setDepth(Float depth) {
		this.depth = depth;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public byte getQuantity_discount() {
		return quantity_discount;
	}

	public void setQuantity_discount(byte quantity_discount) {
		this.quantity_discount = quantity_discount;
	}

	public String getEan13() {
		return ean13;
	}

	public void setEan13(String ean13) {
		this.ean13 = ean13;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getMpn() {
		return mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	public byte getCache_is_pack() {
		return cache_is_pack;
	}

	public void setCache_is_pack(byte cache_is_pack) {
		this.cache_is_pack = cache_is_pack;
	}

	public byte getCache_has_attachments() {
		return cache_has_attachments;
	}

	public void setCache_has_attachments(byte cache_has_attachments) {
		this.cache_has_attachments = cache_has_attachments;
	}

	public byte getIs_virtual() {
		return is_virtual;
	}

	public void setIs_virtual(byte is_virtual) {
		this.is_virtual = is_virtual;
	}

	public Long getState() {
		return state;
	}

	public void setState(Long state) {
		this.state = state;
	}

	public Long getAdditional_delivery_times() {
		return additional_delivery_times;
	}

	public void setAdditional_delivery_times(Long additional_delivery_times) {
		this.additional_delivery_times = additional_delivery_times;
	}

	public List<Language> getDelivery_in_stock() {
		return delivery_in_stock;
	}

	public void setDelivery_in_stock(List<Language> delivery_in_stock) {
		this.delivery_in_stock = delivery_in_stock;
	}

	public List<Language> getDelivery_out_stock() {
		return delivery_out_stock;
	}

	public void setDelivery_out_stock(List<Language> delivery_out_stock) {
		this.delivery_out_stock = delivery_out_stock;
	}

	public byte getOn_sale() {
		return on_sale;
	}

	public void setOn_sale(byte on_sale) {
		this.on_sale = on_sale;
	}

	public byte getOnline_only() {
		return online_only;
	}

	public void setOnline_only(byte online_only) {
		this.online_only = online_only;
	}

	public float getEcotax() {
		return ecotax;
	}

	public void setEcotax(float ecotax) {
		this.ecotax = ecotax;
	}

	public Integer getMinimal_quantity() {
		return minimal_quantity;
	}

	public void setMinimal_quantity(Integer minimal_quantity) {
		this.minimal_quantity = minimal_quantity;
	}

	public int getLow_stock_threshold() {
		return low_stock_threshold;
	}

	public void setLow_stock_threshold(int low_stock_threshold) {
		this.low_stock_threshold = low_stock_threshold;
	}

	public byte getLow_stock_alert() {
		return low_stock_alert;
	}

	public void setLow_stock_alert(byte low_stock_alert) {
		this.low_stock_alert = low_stock_alert;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getWholesale_price() {
		return wholesale_price;
	}

	public void setWholesale_price(float wholesale_price) {
		this.wholesale_price = wholesale_price;
	}

	public String getUnity() {
		return unity;
	}

	public void setUnity(String unity) {
		this.unity = unity;
	}

	public String getUnit_price_ratio() {
		return unit_price_ratio;
	}

	public void setUnit_price_ratio(String unit_price_ratio) {
		this.unit_price_ratio = unit_price_ratio;
	}

	public float getAdditional_shipping_cost() {
		return additional_shipping_cost;
	}

	public void setAdditional_shipping_cost(float additional_shipping_cost) {
		this.additional_shipping_cost = additional_shipping_cost;
	}

	public Integer getCustomizable() {
		return customizable;
	}

	public void setCustomizable(Integer customizable) {
		this.customizable = customizable;
	}

	public Integer getText_fields() {
		return text_fields;
	}

	public void setText_fields(Integer text_fields) {
		this.text_fields = text_fields;
	}

	public Integer getUploadable_files() {
		return uploadable_files;
	}

	public void setUploadable_files(Integer uploadable_files) {
		this.uploadable_files = uploadable_files;
	}

	public byte getActive() {
		return active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getRedirect_type() {
		return redirect_type;
	}

	public void setRedirect_type(String redirect_type) {
		this.redirect_type = redirect_type;
	}

	public Long getId_type_redirected() {
		return id_type_redirected;
	}

	public void setId_type_redirected(Long id_type_redirected) {
		this.id_type_redirected = id_type_redirected;
	}

	public byte getAvailable_for_order() {
		return available_for_order;
	}

	public void setAvailable_for_order(byte available_for_order) {
		this.available_for_order = available_for_order;
	}

	public String getAvailable_date() {
		return available_date;
	}

	public void setAvailable_date(String available_date) {
		this.available_date = available_date;
	}

	public byte getShow_condition() {
		return show_condition;
	}

	public void setShow_condition(byte show_condition) {
		this.show_condition = show_condition;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public byte getShow_price() {
		return show_price;
	}

	public void setShow_price(byte show_price) {
		this.show_price = show_price;
	}

	public byte getIndexed() {
		return indexed;
	}

	public void setIndexed(byte indexed) {
		this.indexed = indexed;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public byte getAdvanced_stock_management() {
		return advanced_stock_management;
	}

	public void setAdvanced_stock_management(byte advanced_stock_management) {
		this.advanced_stock_management = advanced_stock_management;
	}

	public String getDate_add() {
		return date_add;
	}

	public void setDate_add(String date_add) {
		this.date_add = date_add;
	}

	public String getDate_upd() {
		return date_upd;
	}

	public void setDate_upd(String date_upd) {
		this.date_upd = date_upd;
	}

	public Integer getPack_stock_type() {
		return pack_stock_type;
	}

	public void setPack_stock_type(Integer pack_stock_type) {
		this.pack_stock_type = pack_stock_type;
	}

	public List<Language> getMeta_description() {
		return meta_description;
	}

	public void setMeta_description(List<Language> meta_description) {
		this.meta_description = meta_description;
	}

	public List<Language> getMeta_keywords() {
		return meta_keywords;
	}

	public void setMeta_keywords(List<Language> meta_keywords) {
		this.meta_keywords = meta_keywords;
	}

	public List<Language> getMeta_title() {
		return meta_title;
	}

	public void setMeta_title(List<Language> meta_title) {
		this.meta_title = meta_title;
	}

	public List<Language> getLink_rewrite() {
		return link_rewrite;
	}

	public void setLink_rewrite(List<Language> link_rewrite) {
		this.link_rewrite = link_rewrite;
	}

	public List<Language> getName() {
		return name;
	}

	public void setName(List<Language> name) {
		this.name = name;
	}

	public List<Language> getDescription() {
		return description;
	}

	public void setDescription(List<Language> description) {
		this.description = description;
	}

	public List<Language> getDescription_short() {
		return description_short;
	}

	public void setDescription_short(List<Language> description_short) {
		this.description_short = description_short;
	}

	public List<Language> getAvailable_now() {
		return available_now;
	}

	public void setAvailable_now(List<Language> available_now) {
		this.available_now = available_now;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public List<Language> getAvailable_later() {
		return available_later;
	}

	public void setAvailable_later(List<Language> available_later) {
		this.available_later = available_later;
	}

	public AssociationsProducts getAssociations() {
		return associations;
	}

	public void setAssociations(AssociationsProducts associations) {
		this.associations = associations;
	}

	public String getManufacturer_name() {
		return manufacturer_name;
	}

	public void setManufacturer_name(String manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
	}

	@Override
	public String toString() {
		return "Product [href=" + href + ", id=" + id + ", id_manufacturer=" + id_manufacturer + ", id_supplier="
				+ id_supplier + ", id_category_default=" + id_category_default + ", newProp=" + newProp
				+ ", cache_default_attribute=" + cache_default_attribute + ", id_default_image=" + id_default_image
				+ ", id_default_combination=" + id_default_combination + ", id_tax_rules_group=" + id_tax_rules_group
				+ ", position_in_category=" + position_in_category + ", type=" + type + ", id_shop_default="
				+ id_shop_default + ", reference=" + reference + ", supplier_reference=" + supplier_reference
				+ ", location=" + location + ", width=" + width + ", height=" + height + ", depth=" + depth
				+ ", weight=" + weight + ", quantity_discount=" + quantity_discount + ", ean13=" + ean13 + ", isbn="
				+ isbn + ", upc=" + upc + ", mpn=" + mpn + ", manufacturer_name=" + manufacturer_name
				+ ", cache_is_pack=" + cache_is_pack + ", cache_has_attachments=" + cache_has_attachments
				+ ", is_virtual=" + is_virtual + ", state=" + state + ", additional_delivery_times="
				+ additional_delivery_times + ", delivery_in_stock=" + delivery_in_stock + ", delivery_out_stock="
				+ delivery_out_stock + ", on_sale=" + on_sale + ", online_only=" + online_only + ", ecotax=" + ecotax
				+ ", minimal_quantity=" + minimal_quantity + ", low_stock_threshold=" + low_stock_threshold
				+ ", low_stock_alert=" + low_stock_alert + ", price=" + price + ", wholesale_price=" + wholesale_price
				+ ", unity=" + unity + ", unit_price_ratio=" + unit_price_ratio + ", additional_shipping_cost="
				+ additional_shipping_cost + ", customizable=" + customizable + ", text_fields=" + text_fields
				+ ", uploadable_files=" + uploadable_files + ", active=" + active + ", redirect_type=" + redirect_type
				+ ", id_type_redirected=" + id_type_redirected + ", available_for_order=" + available_for_order
				+ ", available_date=" + available_date + ", show_condition=" + show_condition + ", condition="
				+ condition + ", show_price=" + show_price + ", indexed=" + indexed + ", visibility=" + visibility
				+ ", advanced_stock_management=" + advanced_stock_management + ", date_add=" + date_add + ", date_upd="
				+ date_upd + ", pack_stock_type=" + pack_stock_type + ", meta_description=" + meta_description
				+ ", meta_keywords=" + meta_keywords + ", meta_title=" + meta_title + ", link_rewrite=" + link_rewrite
				+ ", name=" + name + ", description=" + description + ", description_short=" + description_short
				+ ", available_now=" + available_now + ", available_later=" + available_later + ", associations="
				+ associations + "]";
	}

	 
	
	
	
}
