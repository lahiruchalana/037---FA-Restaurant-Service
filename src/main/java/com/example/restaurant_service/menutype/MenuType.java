package com.example.restaurant_service.menutype;

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
@Table(name = "menu_type")
public class MenuType {

    /**
     * MenuType entity is using to store menu data of the Restaurants, there might have many menu for a restaurant.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "menu_type_seq_id")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    /**
     * There used a string for itemSet, it should be array inside a string. "["1", "45", "675", "3"]"
     */
    @Column(name = "name")
    private String itemSet;

    @ManyToOne
    private Restaurant restaurant;

    /**
     * priority represent the hierarchy of menus displaying in the website
     */
    @Column(name = "priority")
    private Integer priority;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", updatable = false)
    private Date createdDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_date")
    private Date updatedDate;

}
