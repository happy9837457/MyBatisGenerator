package com.palm.generator.oracle.bean;

import java.math.BigDecimal;
import java.util.Date;

public class UserTabColumns {
    private String tableName;

    private String columnName;

    private String dataType;

    private String dataTypeMod;

    private String dataTypeOwner;

    private BigDecimal dataLength;

    private BigDecimal dataPrecision;

    private BigDecimal dataScale;

    private String nullable;

    private BigDecimal columnId;

    private BigDecimal defaultLength;

    private BigDecimal numDistinct;

    private BigDecimal density;

    private BigDecimal numNulls;

    private BigDecimal numBuckets;

    private Date lastAnalyzed;

    private BigDecimal sampleSize;

    private String characterSetName;

    private BigDecimal charColDeclLength;

    private String globalStats;

    private String userStats;

    private BigDecimal avgColLen;

    private BigDecimal charLength;

    private String charUsed;

    private String v80FmtImage;

    private String dataUpgraded;

    private String histogram;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataTypeMod() {
        return dataTypeMod;
    }

    public void setDataTypeMod(String dataTypeMod) {
        this.dataTypeMod = dataTypeMod;
    }

    public String getDataTypeOwner() {
        return dataTypeOwner;
    }

    public void setDataTypeOwner(String dataTypeOwner) {
        this.dataTypeOwner = dataTypeOwner;
    }

    public BigDecimal getDataLength() {
        return dataLength;
    }

    public void setDataLength(BigDecimal dataLength) {
        this.dataLength = dataLength;
    }

    public BigDecimal getDataPrecision() {
        return dataPrecision;
    }

    public void setDataPrecision(BigDecimal dataPrecision) {
        this.dataPrecision = dataPrecision;
    }

    public BigDecimal getDataScale() {
        return dataScale;
    }

    public void setDataScale(BigDecimal dataScale) {
        this.dataScale = dataScale;
    }

    public String getNullable() {
        return nullable;
    }

    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    public BigDecimal getColumnId() {
        return columnId;
    }

    public void setColumnId(BigDecimal columnId) {
        this.columnId = columnId;
    }

    public BigDecimal getDefaultLength() {
        return defaultLength;
    }

    public void setDefaultLength(BigDecimal defaultLength) {
        this.defaultLength = defaultLength;
    }

    public BigDecimal getNumDistinct() {
        return numDistinct;
    }

    public void setNumDistinct(BigDecimal numDistinct) {
        this.numDistinct = numDistinct;
    }

    public BigDecimal getDensity() {
        return density;
    }

    public void setDensity(BigDecimal density) {
        this.density = density;
    }

    public BigDecimal getNumNulls() {
        return numNulls;
    }

    public void setNumNulls(BigDecimal numNulls) {
        this.numNulls = numNulls;
    }

    public BigDecimal getNumBuckets() {
        return numBuckets;
    }

    public void setNumBuckets(BigDecimal numBuckets) {
        this.numBuckets = numBuckets;
    }

    public Date getLastAnalyzed() {
        return lastAnalyzed;
    }

    public void setLastAnalyzed(Date lastAnalyzed) {
        this.lastAnalyzed = lastAnalyzed;
    }

    public BigDecimal getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(BigDecimal sampleSize) {
        this.sampleSize = sampleSize;
    }

    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public BigDecimal getCharColDeclLength() {
        return charColDeclLength;
    }

    public void setCharColDeclLength(BigDecimal charColDeclLength) {
        this.charColDeclLength = charColDeclLength;
    }

    public String getGlobalStats() {
        return globalStats;
    }

    public void setGlobalStats(String globalStats) {
        this.globalStats = globalStats;
    }

    public String getUserStats() {
        return userStats;
    }

    public void setUserStats(String userStats) {
        this.userStats = userStats;
    }

    public BigDecimal getAvgColLen() {
        return avgColLen;
    }

    public void setAvgColLen(BigDecimal avgColLen) {
        this.avgColLen = avgColLen;
    }

    public BigDecimal getCharLength() {
        return charLength;
    }

    public void setCharLength(BigDecimal charLength) {
        this.charLength = charLength;
    }

    public String getCharUsed() {
        return charUsed;
    }

    public void setCharUsed(String charUsed) {
        this.charUsed = charUsed;
    }

    public String getV80FmtImage() {
        return v80FmtImage;
    }

    public void setV80FmtImage(String v80FmtImage) {
        this.v80FmtImage = v80FmtImage;
    }

    public String getDataUpgraded() {
        return dataUpgraded;
    }

    public void setDataUpgraded(String dataUpgraded) {
        this.dataUpgraded = dataUpgraded;
    }

    public String getHistogram() {
        return histogram;
    }

    public void setHistogram(String histogram) {
        this.histogram = histogram;
    }
}