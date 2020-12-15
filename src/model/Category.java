package model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsCategory;
import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "category")
public class Category implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private Long id_parent;
	private Long level_depth;
	private byte active;
	private String nb_products_recursive;
	private Long id_shop_default;
	private byte is_root_category;
	private String position;
	private String date_add;
	private String date_upd;
	@JacksonXmlElementWrapper
	private List<Language> name;
	@JacksonXmlElementWrapper
	private List<Language> link_rewrite;
	@JacksonXmlElementWrapper
	private List<Language> description;
	@JacksonXmlElementWrapper
	private List<Language> meta_title;
	@JacksonXmlElementWrapper
	private List<Language> meta_description;
	@JacksonXmlElementWrapper
	private List<Language> meta_keywords;
	private AssociationsCategory associations;
	
	private static final long serialVersionUID = -5824352896966941383L;

	
	public Category() {
		super();
	}
	
	

	public Category(String href, Long id, Long id_parent,Long level_depth, byte active, Long id_shop_default, byte is_root_category,
			String position, String nb_products_recursive, String date_add, String date_upd, List<Language> name, List<Language> link_rewrite,
			List<Language> description, List<Language> meta_title, List<Language> meta_description,
			List<Language> meta_keywords, AssociationsCategory associations) {
		super();
		this.href = href;
		this.id = id;
		this.id_parent = id_parent;
		this.level_depth = level_depth;
		this.nb_products_recursive = nb_products_recursive;
		this.active = active;
		this.id_shop_default = id_shop_default;
		this.is_root_category = is_root_category;
		this.position = position;
		this.date_add = date_add;
		this.date_upd = date_upd;
		this.name = name;
		this.link_rewrite = link_rewrite;
		this.description = description;
		this.meta_title = meta_title;
		this.meta_description = meta_description;
		this.meta_keywords = meta_keywords;
		this.associations = associations;
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

	public Long getLevel_depth() {
		return level_depth;
	}

	public void setLevel_depth(Long level_depth) {
		this.level_depth = level_depth;
	}

	public Long getId_parent() {
		return id_parent;
	}

	public void setId_parent(Long id_parent) {
		this.id_parent = id_parent;
	}

	public byte getActive() {
		return active;
	}
	
	
	public String getNb_products_recursive() {
		return nb_products_recursive;
	}



	public void setNb_products_recursive(String nb_products_recursive) {
		this.nb_products_recursive = nb_products_recursive;
	}



	public void setActive(byte active) {
		this.active = active;
	}

	public Long getId_shop_default() {
		return id_shop_default;
	}

	public void setId_shop_default(Long id_shop_default) {
		this.id_shop_default = id_shop_default;
	}

	public byte getIs_root_category() {
		return is_root_category;
	}

	public void setIs_root_category(byte is_root_category) {
		this.is_root_category = is_root_category;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
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

	public List<Language> getName() {
		return name;
	}

	public void setName(List<Language> name) {
		this.name = name;
	}

	public List<Language> getLink_rewrite() {
		return link_rewrite;
	}

	public void setLink_rewrite(List<Language> link_rewrite) {
		this.link_rewrite = link_rewrite;
	}

	public List<Language> getDescription() {
		return description;
	}

	public void setDescription(List<Language> description) {
		this.description = description;
	}

	public List<Language> getMeta_title() {
		return meta_title;
	}

	public void setMeta_title(List<Language> meta_title) {
		this.meta_title = meta_title;
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

	public AssociationsCategory getAssociations() {
		return associations;
	}

	public void setAssociations(AssociationsCategory associations) {
		this.associations = associations;
	}

	@Override
	public String toString() {
		return "Category [href=" + href + ", id=" + id + ", id_parent=" + id_parent + ", active=" + active
				+ ", id_shop_default=" + id_shop_default + ", is_root_category=" + is_root_category + ", position="
				+ position + ", date_add=" + date_add + ", date_upd=" + date_upd + ", name=" + name + ", link_rewrite="
				+ link_rewrite + ", description=" + description + ", meta_title=" + meta_title + ", meta_description="
				+ meta_description + ", meta_keywords=" + meta_keywords + ", associations=" + associations + "]";
	}
	
}
