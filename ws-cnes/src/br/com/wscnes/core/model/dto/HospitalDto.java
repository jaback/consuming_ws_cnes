package br.com.wscnes.core.model.dto;

public class HospitalDto {

	private Long cnes;
	private String companyName;
	private String tradingName;
	private String city;
	private String uf;

	/**
	 * @return the cnes
	 */
	public Long getCnes() {
		return cnes;
	}

	/**
	 * @param cnes
	 *            the cnes to set
	 */
	public void setCnes(Long cnes) {
		this.cnes = cnes;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName
	 *            the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the tradingName
	 */
	public String getTradingName() {
		return tradingName;
	}

	/**
	 * @param tradingName
	 *            the tradingName to set
	 */
	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * @param uf
	 *            the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

}
