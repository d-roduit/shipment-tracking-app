package ch.dc.shipment_tracking_app.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.util.Date;

/**
 * Shipment entity that represents the Shipment table.
 */
@Entity(tableName = "shipments",
        foreignKeys = {
        @ForeignKey(
                entity = Item.class,
                parentColumns = "shipping_number",
                childColumns = "shipping_number",
                onDelete = ForeignKey.CASCADE,
                onUpdate = ForeignKey.CASCADE
        )
}, indices = {
        @Index("shipping_number")
})
public class Shipment {

    /**
     * Id
     */
    @PrimaryKey(autoGenerate = true)
    private int id;

    /**
     * Shipping number
     */
    @ColumnInfo(name = "shipping_number")
    private int shippingNumber;

    /**
     * Status
     */
    private int status;

    /**
     * Date
     */
    private Date date;

    /**
     * NPA
     */
    private String npa;

    /**
     * City
     */
    private String city;


    /**
     * Shipment constructor
     *
     * @param status the status
     * @param npa the npa
     * @param city the city
     */
    public Shipment(int status, String npa, String city) {
        this.status = status;
        this.npa = npa;
        this.city = city;

        Date currentDate = new Date();
        setDate(currentDate);

        setShippingNumber(1);
    }


    /**
     * Getter for id
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for id
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for shippingNumber
     * @return the shipping number
     */
    public int getShippingNumber() {
        return shippingNumber;
    }

    /**
     * Setter for shippingNumber
     * @param shippingNumber the shipping number
     */
    public void setShippingNumber(int shippingNumber) {
        this.shippingNumber = shippingNumber;
    }

    /**
     * Getter for status
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * Setter for status
     * @param status the status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Getter for date
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter for date
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Getter for npa
     * @return the npa
     */
    public String getNpa() {
        return npa;
    }

    /**
     * Setter for npa
     * @param npa the npa
     */
    public void setNpa(String npa) {
        this.npa = npa;
    }

    /**
     * Getter for city
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter for city
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }
}
