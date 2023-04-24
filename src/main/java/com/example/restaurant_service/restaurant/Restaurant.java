package com.example.restaurant_service.restaurant;

import com.example.restaurant_service.restauranttype.RestaurantType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "restaurant_seq_id")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "owner_name")
    private String ownerName;

    @Column(name = "restaurant_type_list")

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "restaurant_restaurant_type",
            joinColumns = { @JoinColumn(name = "restaurant_id") },
            inverseJoinColumns = { @JoinColumn(name = "restaurant_type_id") })
    private Set<RestaurantType> restaurantTypeSet = new HashSet<>();

    @Column(name = "number_one")
    private Integer numberOne;

    @Column(name = "number_two")
    private Integer numberTwo;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", updatable = false)
    private Date createdDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_date")
    private Date updatedDate;

}
