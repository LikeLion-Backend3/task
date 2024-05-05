package com.example.week3.data.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "babylion_detail")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class BabyLionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToOne(optional = false)
    @JoinColumn(name = "babylion_id")
    private BabyLion babylion;

}

