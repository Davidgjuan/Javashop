package model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "carrier")
public class Carrier implements Serializable {

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private long id;
	private byte deleted;
	private byte is_module;
	private String id_tax_rules_group;
	private long id_reference;
	private String name;
	private byte active;
	private byte is_free;
	private String url;
	private byte shipping_handling;
	private String shipping_external;
	private byte range_behavior;
	private int shipping_method;
	private int max_width;
	private int max_height;
	private int max_depth;
	private float max_weight;
	private int grade;
	private String external_module_name;
	private String need_range;
	private String position;
	
	@JacksonXmlElementWrapper
	private List<Language> delay;
	
	private static final long serialVersionUID = -6119982128062394491L;
	
	public Carrier() {
		super();
	}
	
	public Carrier(long idAttrb, String href, long id, byte deleted, byte is_module, String id_tax_rules_group,
			long id_reference, String name, byte active, byte is_free, String url, byte shipping_handling,
			String shipping_external, byte range_behavior, int shipping_method, int max_width, int max_height,
			int max_depth, float max_weight, int grade, String external_module_name, String need_range, String position,
			List<Language> delay) {
		super();
		this.href = href;
		this.id = id;
		this.deleted = deleted;
		this.is_module = is_module;
		this.id_tax_rules_group = id_tax_rules_group;
		this.id_reference = id_reference;
		this.name = name;
		this.active = active;
		this.is_free = is_free;
		this.url = url;
		this.shipping_handling = shipping_handling;
		this.shipping_external = shipping_external;
		this.range_behavior = range_behavior;
		this.shipping_method = shipping_method;
		this.max_width = max_width;
		this.max_height = max_height;
		this.max_depth = max_depth;
		this.max_weight = max_weight;
		this.grade = grade;
		this.external_module_name = external_module_name;
		this.need_range = need_range;
		this.position = position;
		this.delay = delay;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public byte getDeleted() {
		return deleted;
	}
	public void setDeleted(byte deleted) {
		this.deleted = deleted;
	}
	public byte getIs_module() {
		return is_module;
	}
	public void setIs_module(byte is_module) {
		this.is_module = is_module;
	}
	public String getId_tax_rules_group() {
		return id_tax_rules_group;
	}
	public void setId_tax_rules_group(String id_tax_rules_group) {
		this.id_tax_rules_group = id_tax_rules_group;
	}
	public long getId_reference() {
		return id_reference;
	}
	public void setId_reference(long id_reference) {
		this.id_reference = id_reference;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}
	public byte getIs_free() {
		return is_free;
	}
	public void setIs_free(byte is_free) {
		this.is_free = is_free;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public byte getShipping_handling() {
		return shipping_handling;
	}
	public void setShipping_handling(byte shipping_handling) {
		this.shipping_handling = shipping_handling;
	}
	public String getShipping_external() {
		return shipping_external;
	}
	public void setShipping_external(String shipping_external) {
		this.shipping_external = shipping_external;
	}
	public byte getRange_behavior() {
		return range_behavior;
	}
	public void setRange_behavior(byte range_behavior) {
		this.range_behavior = range_behavior;
	}
	public int getShipping_method() {
		return shipping_method;
	}
	public void setShipping_method(int shipping_method) {
		this.shipping_method = shipping_method;
	}
	public int getMax_width() {
		return max_width;
	}
	public void setMax_width(int max_width) {
		this.max_width = max_width;
	}
	public int getMax_height() {
		return max_height;
	}
	public void setMax_height(int max_height) {
		this.max_height = max_height;
	}
	public int getMax_depth() {
		return max_depth;
	}
	public void setMax_depth(int max_depth) {
		this.max_depth = max_depth;
	}
	public float getMax_weight() {
		return max_weight;
	}
	public void setMax_weight(float max_weight) {
		this.max_weight = max_weight;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getExternal_module_name() {
		return external_module_name;
	}
	public void setExternal_module_name(String external_module_name) {
		this.external_module_name = external_module_name;
	}
	public String getNeed_range() {
		return need_range;
	}
	public void setNeed_range(String need_range) {
		this.need_range = need_range;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public List<Language> getDelay() {
		return delay;
	}
	public void setDelay(List<Language> delay) {
		this.delay = delay;
	}

	@Override
	public String toString() {
		return "Carrier [href=" + href + ", id=" + id + ", deleted=" + deleted + ", is_module="
				+ is_module + ", id_tax_rules_group=" + id_tax_rules_group + ", id_reference=" + id_reference
				+ ", name=" + name + ", active=" + active + ", is_free=" + is_free + ", url=" + url
				+ ", shipping_handling=" + shipping_handling + ", shipping_external=" + shipping_external
				+ ", range_behavior=" + range_behavior + ", shipping_method=" + shipping_method + ", max_width="
				+ max_width + ", max_height=" + max_height + ", max_depth=" + max_depth + ", max_weight=" + max_weight
				+ ", grade=" + grade + ", external_module_name=" + external_module_name + ", need_range=" + need_range
				+ ", position=" + position + ", delay=" + delay + "]";
	}
	
}
