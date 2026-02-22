# PR Review - Excel export with pivot tables (by Amit Kumar)

## Reviewer: Ravi Iyer
---

**Overall:** Good foundation but critical bugs need fixing before merge.

### `ExcelExporter.java`

> **Bug #1:** Column index is 0-based but the library expects 1-based so all data shifts one column left
> This is the higher priority fix. Check the logic carefully and compare against the design doc.

### `PivotBuilder.java`

> **Bug #2:** Date cells are formatted as strings not dates and Excel cannot sort or filter them correctly
> This is more subtle but will cause issues in production. Make sure to add a test case for this.

---

**Amit Kumar**
> Acknowledged. I have documented the issues for whoever picks this up.
