/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program2onlinestore;

import java.util.Date;

/**
 *
 * @author Ratna
 */
public class MusicCD extends Item{
    
    //data fields
    private String artists;
    private Date releaseDate;
    private String label;
    private String recordCompany;
    private int totalLength;
    private String genres;
    
    //Constructor
    public MusicCD(String title, double price, String artists, Date releaseDate, String label, String recordCompany, int totalLength, String genres) {
        super(title, price);
        this.artists = artists;
        this.releaseDate = releaseDate;
        this.label = label;
        this.recordCompany = recordCompany;
        this.totalLength = totalLength;
        this.genres = genres;
    }

    //methods
    public String getArtists() {
        return artists;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRecordCompany() {
        return recordCompany;
    }

    public void setRecordCompany(String recordCompany) {
        this.recordCompany = recordCompany;
    }

    public int getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(int totalLength) {
        this.totalLength = totalLength;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }
       
}
