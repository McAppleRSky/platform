package ru.khtu.platform.common.data.entity.catalog.space.wospace;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity @Table(name="w_wospace")
public class WoSpaceEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "spec_id")
    private Long specId;

    //length=700
    @Column(name="woIdTX", length=20, nullable=false)
    private String woIdTX;

    @Column(name="woNameTX", length=330, nullable=false)
    private String woNameTX;

    @Column(name="woRecordStateSY", length=100, nullable=false)
    private String woRecordStateSY;

    @Column(name="woPreviousStateSY", length=100, nullable=false)
    private String woPreviousStateSY;

    @Column(name="woStatusCL", length=150)
    private String woStatusCL;

    @Column(name="woPreviousStatusCL", length=150)
    private String woPreviousStatusCL;

    @Column(name="woFormNameSY", length=150, nullable=false)
    private String woFormNameSY;

    @Column(name="woAddressTX", length=1000, nullable=false)
    private String woAddressTX;

    @Column(name="woKnTX", length=26)
    private String woKnTX;

    @Column(name="woCommentTX", length=400)
    private String woCommentTX;

    @Column(name="woDescriptionTX", length=1000)
    private String woDescriptionTX;

}
