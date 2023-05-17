package com.ua.rd.HW40.domain;


import jakarta.persistence.*;
import lombok.*;


@Data
@Table
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String district;



    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country_id;



}
