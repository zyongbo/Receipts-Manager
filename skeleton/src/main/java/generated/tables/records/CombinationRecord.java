/**
 * This class is generated by jOOQ
 */
package generated.tables.records;


import generated.tables.Combination;
import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Time;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CombinationRecord extends TableRecordImpl<CombinationRecord> implements Record5<Integer, Time, String, BigDecimal, String> {

	private static final long serialVersionUID = 980901617;

	/**
	 * Setter for <code>public.combination.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.combination.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.combination.uploaded</code>.
	 */
	public void setUploaded(Time value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.combination.uploaded</code>.
	 */
	public Time getUploaded() {
		return (Time) getValue(1);
	}

	/**
	 * Setter for <code>public.combination.merchant</code>.
	 */
	public void setMerchant(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.combination.merchant</code>.
	 */
	public String getMerchant() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.combination.amount</code>.
	 */
	public void setAmount(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.combination.amount</code>.
	 */
	public BigDecimal getAmount() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>public.combination.tag</code>.
	 */
	public void setTag(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.combination.tag</code>.
	 */
	public String getTag() {
		return (String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Time, String, BigDecimal, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Time, String, BigDecimal, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Combination.COMBINATION.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Time> field2() {
		return Combination.COMBINATION.UPLOADED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Combination.COMBINATION.MERCHANT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return Combination.COMBINATION.AMOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Combination.COMBINATION.TAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Time value2() {
		return getUploaded();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getMerchant();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getAmount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getTag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CombinationRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CombinationRecord value2(Time value) {
		setUploaded(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CombinationRecord value3(String value) {
		setMerchant(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CombinationRecord value4(BigDecimal value) {
		setAmount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CombinationRecord value5(String value) {
		setTag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CombinationRecord values(Integer value1, Time value2, String value3, BigDecimal value4, String value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CombinationRecord
	 */
	public CombinationRecord() {
		super(Combination.COMBINATION);
	}

	/**
	 * Create a detached, initialised CombinationRecord
	 */
	public CombinationRecord(Integer id, Time uploaded, String merchant, BigDecimal amount, String tag) {
		super(Combination.COMBINATION);

		setValue(0, id);
		setValue(1, uploaded);
		setValue(2, merchant);
		setValue(3, amount);
		setValue(4, tag);
	}
}
