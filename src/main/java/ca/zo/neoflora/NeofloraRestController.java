package ca.zo.neoflora;

import io.micronaut.http.annotation.*;

@Controller("/neofloraRest")
public class NeofloraRestController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}