/*
 * Copyright (c) 2010 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.

 * Author: Yuryi Artamonov
 * Created: 19.10.2010 16:51:23
 *
 * $Id$
 */
package com.haulmont.cuba.report;

import javax.persistence.*;

@Entity(name = "report$ReportValueFormat")
@Table(name = "REPORT_VALUE_FORMAT")
public class ReportValueFormat extends HardDeleteEntity {

    @Column(name = "NAME")
    private String valueName;

    @Column(name = "FORMAT")
    private String formatString;

    //@Column(name = "POSITION")
    //private Integer position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REPORT_ID")
    private Report report;

   /* public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
*/
    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public String getFormatString() {
        return formatString;
    }

    public void setFormatString(String formatString) {
        this.formatString = formatString;
    }
}
