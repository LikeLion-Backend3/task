package com.example.week3.data.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@Table(name = "hobby")
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hobby;

    @OneToMany(mappedBy = "hobby", fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<BabyLion> babyLionList = new ArrayList<>();
}
