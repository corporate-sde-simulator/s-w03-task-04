import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class ExcelExporterTest {
    @Test void shouldProcessValid() {
        ExcelExporter obj = new ExcelExporter();
        assertNotNull(obj.process(Map.of("key", "val")));
    }
    @Test void shouldHandleNull() {
        ExcelExporter obj = new ExcelExporter();
        assertNull(obj.process(null));
    }
    @Test void shouldTrackStats() {
        ExcelExporter obj = new ExcelExporter();
        obj.process(Map.of("x", 1));
        assertEquals(1, obj.getStats().get("processed"));
    }
    @Test void supportShouldWork() {
        PivotBuilder obj = new PivotBuilder();
        assertNotNull(obj.process(Map.of("data", "test")));
    }
}
