package com.palm.generator.oracle.bean;

import java.math.BigDecimal;
import java.util.Date;

public class UserTables {
    private String tableName;

    private String tablespaceName;

    private String clusterName;

    private String iotName;

    private String status;

    private BigDecimal pctFree;

    private BigDecimal pctUsed;

    private BigDecimal iniTrans;

    private BigDecimal maxTrans;

    private BigDecimal initialExtent;

    private BigDecimal nextExtent;

    private BigDecimal minExtents;

    private BigDecimal maxExtents;

    private BigDecimal pctIncrease;

    private BigDecimal freelists;

    private BigDecimal freelistGroups;

    private String logging;

    private String backedUp;

    private BigDecimal numRows;

    private BigDecimal blocks;

    private BigDecimal emptyBlocks;

    private BigDecimal avgSpace;

    private BigDecimal chainCnt;

    private BigDecimal avgRowLen;

    private BigDecimal avgSpaceFreelistBlocks;

    private BigDecimal numFreelistBlocks;

    private String degree;

    private String instances;

    private String cache;

    private String tableLock;

    private BigDecimal sampleSize;

    private Date lastAnalyzed;

    private String partitioned;

    private String iotType;

    private String temporary;

    private String secondary;

    private String nested;

    private String bufferPool;

    private String rowMovement;

    private String globalStats;

    private String userStats;

    private String duration;

    private String skipCorrupt;

    private String monitoring;

    private String clusterOwner;

    private String dependencies;

    private String compression;

    private String dropped;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTablespaceName() {
        return tablespaceName;
    }

    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getIotName() {
        return iotName;
    }

    public void setIotName(String iotName) {
        this.iotName = iotName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getPctFree() {
        return pctFree;
    }

    public void setPctFree(BigDecimal pctFree) {
        this.pctFree = pctFree;
    }

    public BigDecimal getPctUsed() {
        return pctUsed;
    }

    public void setPctUsed(BigDecimal pctUsed) {
        this.pctUsed = pctUsed;
    }

    public BigDecimal getIniTrans() {
        return iniTrans;
    }

    public void setIniTrans(BigDecimal iniTrans) {
        this.iniTrans = iniTrans;
    }

    public BigDecimal getMaxTrans() {
        return maxTrans;
    }

    public void setMaxTrans(BigDecimal maxTrans) {
        this.maxTrans = maxTrans;
    }

    public BigDecimal getInitialExtent() {
        return initialExtent;
    }

    public void setInitialExtent(BigDecimal initialExtent) {
        this.initialExtent = initialExtent;
    }

    public BigDecimal getNextExtent() {
        return nextExtent;
    }

    public void setNextExtent(BigDecimal nextExtent) {
        this.nextExtent = nextExtent;
    }

    public BigDecimal getMinExtents() {
        return minExtents;
    }

    public void setMinExtents(BigDecimal minExtents) {
        this.minExtents = minExtents;
    }

    public BigDecimal getMaxExtents() {
        return maxExtents;
    }

    public void setMaxExtents(BigDecimal maxExtents) {
        this.maxExtents = maxExtents;
    }

    public BigDecimal getPctIncrease() {
        return pctIncrease;
    }

    public void setPctIncrease(BigDecimal pctIncrease) {
        this.pctIncrease = pctIncrease;
    }

    public BigDecimal getFreelists() {
        return freelists;
    }

    public void setFreelists(BigDecimal freelists) {
        this.freelists = freelists;
    }

    public BigDecimal getFreelistGroups() {
        return freelistGroups;
    }

    public void setFreelistGroups(BigDecimal freelistGroups) {
        this.freelistGroups = freelistGroups;
    }

    public String getLogging() {
        return logging;
    }

    public void setLogging(String logging) {
        this.logging = logging;
    }

    public String getBackedUp() {
        return backedUp;
    }

    public void setBackedUp(String backedUp) {
        this.backedUp = backedUp;
    }

    public BigDecimal getNumRows() {
        return numRows;
    }

    public void setNumRows(BigDecimal numRows) {
        this.numRows = numRows;
    }

    public BigDecimal getBlocks() {
        return blocks;
    }

    public void setBlocks(BigDecimal blocks) {
        this.blocks = blocks;
    }

    public BigDecimal getEmptyBlocks() {
        return emptyBlocks;
    }

    public void setEmptyBlocks(BigDecimal emptyBlocks) {
        this.emptyBlocks = emptyBlocks;
    }

    public BigDecimal getAvgSpace() {
        return avgSpace;
    }

    public void setAvgSpace(BigDecimal avgSpace) {
        this.avgSpace = avgSpace;
    }

    public BigDecimal getChainCnt() {
        return chainCnt;
    }

    public void setChainCnt(BigDecimal chainCnt) {
        this.chainCnt = chainCnt;
    }

    public BigDecimal getAvgRowLen() {
        return avgRowLen;
    }

    public void setAvgRowLen(BigDecimal avgRowLen) {
        this.avgRowLen = avgRowLen;
    }

    public BigDecimal getAvgSpaceFreelistBlocks() {
        return avgSpaceFreelistBlocks;
    }

    public void setAvgSpaceFreelistBlocks(BigDecimal avgSpaceFreelistBlocks) {
        this.avgSpaceFreelistBlocks = avgSpaceFreelistBlocks;
    }

    public BigDecimal getNumFreelistBlocks() {
        return numFreelistBlocks;
    }

    public void setNumFreelistBlocks(BigDecimal numFreelistBlocks) {
        this.numFreelistBlocks = numFreelistBlocks;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getInstances() {
        return instances;
    }

    public void setInstances(String instances) {
        this.instances = instances;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getTableLock() {
        return tableLock;
    }

    public void setTableLock(String tableLock) {
        this.tableLock = tableLock;
    }

    public BigDecimal getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(BigDecimal sampleSize) {
        this.sampleSize = sampleSize;
    }

    public Date getLastAnalyzed() {
        return lastAnalyzed;
    }

    public void setLastAnalyzed(Date lastAnalyzed) {
        this.lastAnalyzed = lastAnalyzed;
    }

    public String getPartitioned() {
        return partitioned;
    }

    public void setPartitioned(String partitioned) {
        this.partitioned = partitioned;
    }

    public String getIotType() {
        return iotType;
    }

    public void setIotType(String iotType) {
        this.iotType = iotType;
    }

    public String getTemporary() {
        return temporary;
    }

    public void setTemporary(String temporary) {
        this.temporary = temporary;
    }

    public String getSecondary() {
        return secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public String getNested() {
        return nested;
    }

    public void setNested(String nested) {
        this.nested = nested;
    }

    public String getBufferPool() {
        return bufferPool;
    }

    public void setBufferPool(String bufferPool) {
        this.bufferPool = bufferPool;
    }

    public String getRowMovement() {
        return rowMovement;
    }

    public void setRowMovement(String rowMovement) {
        this.rowMovement = rowMovement;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSkipCorrupt() {
        return skipCorrupt;
    }

    public void setSkipCorrupt(String skipCorrupt) {
        this.skipCorrupt = skipCorrupt;
    }

    public String getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(String monitoring) {
        this.monitoring = monitoring;
    }

    public String getClusterOwner() {
        return clusterOwner;
    }

    public void setClusterOwner(String clusterOwner) {
        this.clusterOwner = clusterOwner;
    }

    public String getDependencies() {
        return dependencies;
    }

    public void setDependencies(String dependencies) {
        this.dependencies = dependencies;
    }

    public String getCompression() {
        return compression;
    }

    public void setCompression(String compression) {
        this.compression = compression;
    }

    public String getDropped() {
        return dropped;
    }

    public void setDropped(String dropped) {
        this.dropped = dropped;
    }
}