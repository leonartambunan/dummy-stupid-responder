package id.nio.iso.controller;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/json",
        consumes = MediaType.TEXT_PLAIN_VALUE,
        produces = MediaType.TEXT_PLAIN_VALUE,
        method = {RequestMethod.GET, RequestMethod.POST})
public class JsonController {

    @PostMapping("/")
    public String rootContext(@RequestBody String request){

        System.out.println("rootContext");

        JSONParser parser = new JSONParser();
        JSONObject jsonRequest=null;
        try {
            jsonRequest = (JSONObject) parser.parse(request);
        } catch (ParseException e) {
            e.printStackTrace();
                }

        return jsonRequest==null?"":jsonRequest.toJSONString();
    }

    @PostMapping("/pacs")
    public String pacs(@RequestBody String request){

        JSONParser parser = new JSONParser();
        JSONObject jsonRequest=null;
        try {
            jsonRequest = (JSONObject) parser.parse(request);
        } catch (ParseException e) {
            e.printStackTrace();
                }

        return jsonRequest==null?"":jsonRequest.toJSONString();
    }

    @PostMapping("/pain")
    public String pain(@RequestBody String request){

        JSONParser parser = new JSONParser();
        JSONObject jsonRequest=null;
        try {
            jsonRequest = (JSONObject) parser.parse(request);
        } catch (ParseException e) {
            e.printStackTrace();
                }

        return jsonRequest==null?"":jsonRequest.toJSONString();
    }
}
