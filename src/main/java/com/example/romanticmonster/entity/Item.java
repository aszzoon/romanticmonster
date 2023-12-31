package com.example.romanticmonster.entity;


import com.example.romanticmonster.constant.ItemSellStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity //클래스를 엔티티로 선언
@Table(name = "item") //엔티티와 매핑할 테이블을 지정
@Getter //
@Setter
@ToString
public class Item {


    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; //싱픔코드
    @Column(nullable = false, length = 50)
    private String itemNm; //상품명

    @Column(name = "price", nullable = false)
    private int price; //가격

    @Column(nullable = false)
    private int stockNumber; //재고수량

    @Lob
    @Column(nullable = false)
    private String itemDetail;  //상품 상세 설명
    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus; //상품 판매 상태
    private LocalDateTime regTime;  //등록 시간
    private LocalDateTime updateTime;   //수정 시간
}

