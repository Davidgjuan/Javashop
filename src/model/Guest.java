package model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "guest")
public class Guest implements Serializable {

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private Long id;
	 private Long id_customer;
	 private Long id_operating_system;
	 private Long id_web_browser;
	 private byte javascript;
	 private int screen_resolution_x;
	 private int screen_resolution_y;
	 private int screen_color;
	 private byte sun_java;
	 private byte adobe_flash;
	 private byte adobe_director;
	 private byte apple_quicktime;
	 private byte real_player;
	 private byte windows_media;
	 private String accept_language;
	 private byte mobile_theme;
	
	private static final long serialVersionUID = -6119982128062394491L;
	
	public Guest() {
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

	public Long getId_customer() {
		return id_customer;
	}

	public void setId_customer(Long id_customer) {
		this.id_customer = id_customer;
	}

	public Long getId_operating_system() {
		return id_operating_system;
	}

	public void setId_operating_system(Long id_operating_system) {
		this.id_operating_system = id_operating_system;
	}

	public Long getId_web_browser() {
		return id_web_browser;
	}

	public void setId_web_browser(Long id_web_browser) {
		this.id_web_browser = id_web_browser;
	}

	public byte getJavascript() {
		return javascript;
	}

	public void setJavascript(byte javascript) {
		this.javascript = javascript;
	}

	public int getScreen_resolution_x() {
		return screen_resolution_x;
	}

	public void setScreen_resolution_x(int screen_resolution_x) {
		this.screen_resolution_x = screen_resolution_x;
	}

	public int getScreen_resolution_y() {
		return screen_resolution_y;
	}

	public void setScreen_resolution_y(int screen_resolution_y) {
		this.screen_resolution_y = screen_resolution_y;
	}

	public int getScreen_color() {
		return screen_color;
	}

	public void setScreen_color(int screen_color) {
		this.screen_color = screen_color;
	}

	public byte getSun_java() {
		return sun_java;
	}

	public void setSun_java(byte sun_java) {
		this.sun_java = sun_java;
	}

	public byte getAdobe_flash() {
		return adobe_flash;
	}

	public void setAdobe_flash(byte adobe_flash) {
		this.adobe_flash = adobe_flash;
	}

	public byte getAdobe_director() {
		return adobe_director;
	}

	public void setAdobe_director(byte adobe_director) {
		this.adobe_director = adobe_director;
	}

	public byte getApple_quicktime() {
		return apple_quicktime;
	}

	public void setApple_quicktime(byte apple_quicktime) {
		this.apple_quicktime = apple_quicktime;
	}

	public byte getReal_player() {
		return real_player;
	}

	public void setReal_player(byte real_player) {
		this.real_player = real_player;
	}

	public byte getWindows_media() {
		return windows_media;
	}

	public void setWindows_media(byte windows_media) {
		this.windows_media = windows_media;
	}

	public String getAccept_language() {
		return accept_language;
	}

	public void setAccept_language(String accept_language) {
		this.accept_language = accept_language;
	}

	public byte getMobile_theme() {
		return mobile_theme;
	}

	public void setMobile_theme(byte mobile_theme) {
		this.mobile_theme = mobile_theme;
	}

	@Override
	public String toString() {
		return "Guest [href=" + href + ", id=" + id + ", id_customer=" + id_customer + ", id_operating_system="
				+ id_operating_system + ", id_web_browser=" + id_web_browser + ", javascript=" + javascript
				+ ", screen_resolution_x=" + screen_resolution_x + ", screen_resolution_y=" + screen_resolution_y
				+ ", screen_color=" + screen_color + ", sun_java=" + sun_java + ", adobe_flash=" + adobe_flash
				+ ", adobe_director=" + adobe_director + ", apple_quicktime=" + apple_quicktime + ", real_player="
				+ real_player + ", windows_media=" + windows_media + ", accept_language=" + accept_language
				+ ", mobile_theme=" + mobile_theme + "]";
	}
}
