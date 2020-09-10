package com.springboot.cms.pojo;

import io.swagger.annotations.ApiParam;

import java.io.Serializable;
import java.util.Objects;

/**
 * 社团实体类
 *
 * @author YuanhuiHo
 */
public class Society implements Serializable {

    @ApiParam("主键id")
    private Integer id;
    @ApiParam("社团名称")
    private String societyName;
    @ApiParam("创建时间")
    private String creationTime;
    @ApiParam("成立时间")
    private String establishTime;
    @ApiParam("社团简介")
    private String introduction;
    @ApiParam("社团详细信息")
    private String societyDetails;
    @ApiParam("社团照片")
    private String source;
    @ApiParam("社团状态-审核失败/审核通过/正在审核")
    private String status;
    @ApiParam("音乐文件")
    private String music;
    @ApiParam("视频文件")
    private String video;
    @ApiParam("社团性质")
    private String societyNature;
    @ApiParam("创始人")
    private String founder;
    @ApiParam("社团人数")
    private Integer societyPersonnelTotal;
    @ApiParam("总资金")
    private Double totalFunds;
    @ApiParam("已用资金")
    private Double usedFunds;

    public Society() {
    }

    public Society(Integer id, String societyName, String creationTime, String establishTime, String introduction, String societyDetails, String source, String status, String music, String video, String societyNature, String founder, Integer societyPersonnelTotal, Double totalFunds, Double usedFunds) {
        this.id = id;
        this.societyName = societyName;
        this.creationTime = creationTime;
        this.establishTime = establishTime;
        this.introduction = introduction;
        this.societyDetails = societyDetails;
        this.source = source;
        this.status = status;
        this.music = music;
        this.video = video;
        this.societyNature = societyNature;
        this.founder = founder;
        this.societyPersonnelTotal = societyPersonnelTotal;
        this.totalFunds = totalFunds;
        this.usedFunds = usedFunds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getEstablishTime() {
        return establishTime;
    }

    public void setEstablishTime(String establishTime) {
        this.establishTime = establishTime;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getSocietyDetails() {
        return societyDetails;
    }

    public void setSocietyDetails(String societyDetails) {
        this.societyDetails = societyDetails;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getSocietyNature() {
        return societyNature;
    }

    public void setSocietyNature(String societyNature) {
        this.societyNature = societyNature;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public Integer getSocietyPersonnelTotal() {
        return societyPersonnelTotal;
    }

    public void setSocietyPersonnelTotal(Integer societyPersonnelTotal) {
        this.societyPersonnelTotal = societyPersonnelTotal;
    }

    public Double getTotalFunds() {
        return totalFunds;
    }

    public void setTotalFunds(Double totalFunds) {
        this.totalFunds = totalFunds;
    }

    public Double getUsedFunds() {
        return usedFunds;
    }

    public void setUsedFunds(Double usedFunds) {
        this.usedFunds = usedFunds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Society society = (Society) o;
        return Objects.equals(id, society.id) &&
                Objects.equals(societyName, society.societyName) &&
                Objects.equals(creationTime, society.creationTime) &&
                Objects.equals(establishTime, society.establishTime) &&
                Objects.equals(introduction, society.introduction) &&
                Objects.equals(societyDetails, society.societyDetails) &&
                Objects.equals(source, society.source) &&
                Objects.equals(status, society.status) &&
                Objects.equals(music, society.music) &&
                Objects.equals(video, society.video) &&
                Objects.equals(societyNature, society.societyNature) &&
                Objects.equals(founder, society.founder) &&
                Objects.equals(societyPersonnelTotal, society.societyPersonnelTotal) &&
                Objects.equals(totalFunds, society.totalFunds) &&
                Objects.equals(usedFunds, society.usedFunds);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, societyName, creationTime, establishTime, introduction, societyDetails, source, status, music, video, societyNature, founder, societyPersonnelTotal, totalFunds, usedFunds);
    }

    @Override
    public String toString() {
        return "Society{" +
                "id=" + id +
                ", societyName='" + societyName + '\'' +
                ", creationTime='" + creationTime + '\'' +
                ", establishTime='" + establishTime + '\'' +
                ", introduction='" + introduction + '\'' +
                ", societyDetails='" + societyDetails + '\'' +
                ", source='" + source + '\'' +
                ", status='" + status + '\'' +
                ", music='" + music + '\'' +
                ", video='" + video + '\'' +
                ", societyNature='" + societyNature + '\'' +
                ", founder='" + founder + '\'' +
                ", societyPersonnelTotal=" + societyPersonnelTotal +
                ", totalFunds=" + totalFunds +
                ", usedFunds=" + usedFunds +
                '}';
    }
}
