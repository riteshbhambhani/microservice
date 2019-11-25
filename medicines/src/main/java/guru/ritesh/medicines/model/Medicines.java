package guru.ritesh.medicines.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEDICINES")
public class Medicines {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="pid")
	private Long patientID;
	private String start_date;
	private String end_date;
	private String rxnorm;
	private String name;
	private String sig;
	private Double q;
	private Integer days;
	private Integer refills;
	private Integer q_to_take_value;
	private String q_to_take_unit;
	private String frequency_value;
	private String frequency_unit;
	/**
	 * @return the start_date
	 */
	public String getStart_date() {
		return start_date;
	}

	/**
	 * @param start_date the start_date to set
	 */
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	/**
	 * @return the end_date
	 */
	public String getEnd_date() {
		return end_date;
	}

	/**
	 * @param end_date the end_date to set
	 */
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	/**
	 * @param patientID the patientID to set
	 */
	public void setPatientID(Long patientID) {
		this.patientID = patientID;
	}

	/**
	 * @param q the q to set
	 */
	public void setQ(Double q) {
		this.q = q;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(Integer days) {
		this.days = days;
	}

	/**
	 * @param refills the refills to set
	 */
	public void setRefills(Integer refills) {
		this.refills = refills;
	}

	/**
	 * @param q_to_take_value the q_to_take_value to set
	 */
	public void setQ_to_take_value(Integer q_to_take_value) {
		this.q_to_take_value = q_to_take_value;
	}


	@Override
	public String toString() {
		return "Medicines [id=" + id + ", patientID=" + patientID + ", start_date=" + start_date + ", end_date="
				+ end_date + ", rxnorm=" + rxnorm + ", name=" + name + ", sig=" + sig + ", q=" + q + ", days=" + days
				+ ", refills=" + refills + ", q_to_take_value=" + q_to_take_value + ", q_to_take_unit=" + q_to_take_unit
				+ ", frequency_value=" + frequency_value + ", frequency_unit=" + frequency_unit + ", toString()="
				+ super.toString() + "]";
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the patientID
	 */
	public long getPatientID() {
		return patientID;
	}


	/**
	 * @return the rxnorm
	 */
	public String getRxnorm() {
		return rxnorm;
	}

	/**
	 * @param rxnorm the rxnorm to set
	 */
	public void setRxnorm(String rxnorm) {
		this.rxnorm = rxnorm;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sig
	 */
	public String getSig() {
		return sig;
	}

	/**
	 * @param sig the sig to set
	 */
	public void setSig(String sig) {
		this.sig = sig;
	}

	/**
	 * @return the q
	 */
	public double getQ() {
		return q;
	}

	/**
	 * @param q the q to set
	 */
	public void setQ(double q) {
		this.q = q;
	}

	/**
	 * @return the days
	 */
	public int getDays() {
		return days;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(int days) {
		this.days = days;
	}

	/**
	 * @return the refills
	 */
	public int getRefills() {
		return refills;
	}

	/**
	 * @param refills the refills to set
	 */
	public void setRefills(int refills) {
		this.refills = refills;
	}

	/**
	 * @return the q_to_take_value
	 */
	public int getQ_to_take_value() {
		return q_to_take_value;
	}

	/**
	 * @param q_to_take_value the q_to_take_value to set
	 */
	public void setQ_to_take_value(int q_to_take_value) {
		this.q_to_take_value = q_to_take_value;
	}

	/**
	 * @return the q_to_take_unit
	 */
	public String getQ_to_take_unit() {
		return q_to_take_unit;
	}

	/**
	 * @param q_to_take_unit the q_to_take_unit to set
	 */
	public void setQ_to_take_unit(String q_to_take_unit) {
		this.q_to_take_unit = q_to_take_unit;
	}

	/**
	 * @return the frequency_value
	 */
	public String getFrequency_value() {
		return frequency_value;
	}

	/**
	 * @param frequency_value the frequency_value to set
	 */
	public void setFrequency_value(String frequency_value) {
		this.frequency_value = frequency_value;
	}

	/**
	 * @return the frequency_unit
	 */
	public String getFrequency_unit() {
		return frequency_unit;
	}

	/**
	 * @param frequency_unit the frequency_unit to set
	 */
	public void setFrequency_unit(String frequency_unit) {
		this.frequency_unit = frequency_unit;
	}

}
