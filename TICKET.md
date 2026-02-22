# FINSERV-4133: Build Excel export with pivot table support

**Status:** In Progress · **Priority:** Medium
**Sprint:** Sprint 25 · **Story Points:** 5
**Reporter:** Kavitha Rao (Reports Lead) · **Assignee:** You (Intern)
**Labels:** `backend`, `java`, `export`, `feature`
**Task Type:** Feature Ship

---

## Description

The Excel exporter can write basic data rows. Implement the `PivotBuilder` that creates pivot-table summaries from raw data — grouping by row/column dimensions and computing value aggregates.

## Acceptance Criteria

- [ ] `buildPivot()` groups data by row and column dimensions
- [ ] Supports sum, count, average aggregation functions
- [ ] Grand totals computed for rows and columns
- [ ] All unit tests pass
