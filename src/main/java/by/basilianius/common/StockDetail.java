package by.basilianius.common;

import java.util.Date;

/**
 * Created by Basilianius on 28.04.2015.
 */
public class StockDetail implements java.io.Serializable {

    private Integer stockId;
    private Stock stock;
    private String compName;
    private String compDesc;
    private String remark;
    private Date listedDate;

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getCompName() {
        return this.compName;
    }

    public void setCompDesc(String compDesc) {
        this.compDesc = compDesc;
    }

    public String getCompDesc() {
        return this.compDesc;
    }

    public Integer getStockId() {
        return this.stockId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setListedDate(Date listedDate) {
        this.listedDate = listedDate;
    }

    public Date getListedDate() {
        return this.listedDate;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
    public Stock getStock() {
        return this.stock;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }
}
