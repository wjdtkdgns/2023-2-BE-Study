package gdsc.backend.BootDemo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/demo")
public class DemoController {
    private final DemoService demoService;

    @GetMapping("/demoEntities")
    public ResponseEntity<List<DemoDto>> getDemoEntities() {
        return ResponseEntity.ok().body(demoService.getDemoEntitys());
    }

    @PostMapping("/demoEntities")
    public void getDemoEntities(@RequestBody DemoDto demoDto) {
        demoService.addDemoEntity(demoDto);
    }

    @GetMapping("/demoEntities/{id}")
    public ResponseEntity<DemoDto> getDemoEntities(@RequestBody DemoDto demoDto,
                                @PathVariable("id") Long id) {
        return ResponseEntity.ok().body(demoService.getDemoEntity(id));
    }
}
