package com.example.restaurant_service.table;

import com.example.restaurant_service.restaurant.Restaurant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@jakarta.persistence.Table(name = "table")
public class Table {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "table_seq_id")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    /**
     * price per person
     */
    @Column(name = "avg_max_price")
    private Float avgMaxPrice;

    /**
     * price per person
     */
    @Column(name = "avg_min_price")
    private Float avgMinPrice;

    @ManyToOne
    private Restaurant restaurant;

    @Column(name = "number_of_chairs")
    private Integer numberOfChairs;

    /**
     * describe the view and other key features - party rooms
     */
    @Column(name = "view")
    private String view;

    /**
     * image Set String represent the array of urls
     */
    @Column(name = "image_set")
    private String imageSet;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", updatable = false)
    private Date createdDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_date")
    private Date updatedDate;

}
