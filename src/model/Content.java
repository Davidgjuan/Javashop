package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsCart;
import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "content")
public class Content implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private Long position;
	private Long id_cms_category;
	private Long indexation;
	private byte active;
	@XmlElementWrapper
	private List<Language> meta_description;
	@XmlElementWrapper
	private List<Language> meta_keywords;
	@XmlElementWrapper
	private List<Language> meta_title;
	@XmlElementWrapper
	private List<Language> head_seo_title;
	@XmlElementWrapper
	private List<Language> link_rewrite;
	@XmlElementWrapper
	private List<Language> content;

	private static final long serialVersionUID = 7299349908202209532L;
	
	public Content() {
		super();
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
	
	public Long getPosition() {
		return position;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	public Long getId_cms_category() {
		return id_cms_category;
	}

	public void setId_cms_category(Long id_cms_category) {
		this.id_cms_category = id_cms_category;
	}

	public Long getIndexation() {
		return indexation;
	}

	public void setIndexation(Long indexation) {
		this.indexation = indexation;
	}

	public byte getActive() {
		return active;
	}

	public void setActive(byte active) {
		this.active = active;
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

	public List<Language> getHead_seo_title() {
		return head_seo_title;
	}

	public void setHead_seo_title(List<Language> head_seo_title) {
		this.head_seo_title = head_seo_title;
	}

	public List<Language> getLink_rewrite() {
		return link_rewrite;
	}

	public void setLink_rewrite(List<Language> link_rewrite) {
		this.link_rewrite = link_rewrite;
	}

	public List<Language> getContent() {
		return content;
	}

	public void setContent(List<Language> content) {
		this.content = content;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Content [href=" + href + ", id=" + id + ", position=" + position + ", id_cms_category="
				+ id_cms_category + ", indexation=" + indexation + ", active=" + active + ", meta_description="
				+ meta_description + ", meta_keywords=" + meta_keywords + ", meta_title=" + meta_title
				+ ", head_seo_title=" + head_seo_title + ", link_rewrite=" + link_rewrite + ", content=" + content
				+ "]";
	}
}
