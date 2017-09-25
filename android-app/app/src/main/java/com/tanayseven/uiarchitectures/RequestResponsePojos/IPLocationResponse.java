package com.tanayseven.uiarchitectures.RequestResponsePojos;

import java.io.Serializable;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.ToStringBuilder;

public class IPLocationResponse implements Serializable, Parcelable {

    @SerializedName("as")
    @Expose
    private String as;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("isp")
    @Expose
    private String isp;
    @SerializedName("lat")
    @Expose
    private double lat;
    @SerializedName("lon")
    @Expose
    private double lon;
    @SerializedName("org")
    @Expose
    private String org;
    @SerializedName("query")
    @Expose
    private String query;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("regionName")
    @Expose
    private String regionName;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("zip")
    @Expose
    private String zip;
    public final static Parcelable.Creator<IPLocationResponse> CREATOR = new Creator<IPLocationResponse>() {


        @SuppressWarnings({
                "unchecked"
        })
        public IPLocationResponse createFromParcel(Parcel in) {
            return new IPLocationResponse(in);
        }

        public IPLocationResponse[] newArray(int size) {
            return (new IPLocationResponse[size]);
        }

    };
    private final static long serialVersionUID = -2191997030995623517L;

    protected IPLocationResponse(Parcel in) {
        this.as = ((String) in.readValue((String.class.getClassLoader())));
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.countryCode = ((String) in.readValue((String.class.getClassLoader())));
        this.isp = ((String) in.readValue((String.class.getClassLoader())));
        this.lat = ((double) in.readValue((double.class.getClassLoader())));
        this.lon = ((double) in.readValue((double.class.getClassLoader())));
        this.org = ((String) in.readValue((String.class.getClassLoader())));
        this.query = ((String) in.readValue((String.class.getClassLoader())));
        this.region = ((String) in.readValue((String.class.getClassLoader())));
        this.regionName = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.timezone = ((String) in.readValue((String.class.getClassLoader())));
        this.zip = ((String) in.readValue((String.class.getClassLoader())));
    }

    public IPLocationResponse() {
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("as", as).append("city", city).append("country", country).append("countryCode", countryCode).append("isp", isp).append("lat", lat).append("lon", lon).append("org", org).append("query", query).append("region", region).append("regionName", regionName).append("status", status).append("timezone", timezone).append("zip", zip).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(as);
        dest.writeValue(city);
        dest.writeValue(country);
        dest.writeValue(countryCode);
        dest.writeValue(isp);
        dest.writeValue(lat);
        dest.writeValue(lon);
        dest.writeValue(org);
        dest.writeValue(query);
        dest.writeValue(region);
        dest.writeValue(regionName);
        dest.writeValue(status);
        dest.writeValue(timezone);
        dest.writeValue(zip);
    }

    public int describeContents() {
        return 0;
    }

}
