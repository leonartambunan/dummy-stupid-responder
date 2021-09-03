package id.nio.iso.controller;

import com.prowidesoftware.swift.model.mx.MxPacs00800109;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

@Controller
public class XmlController  {

    @PostMapping(value = "/xml", produces = MediaType.TEXT_PLAIN_VALUE)
    public @ResponseBody String  root (@RequestBody String str)  {
        logger.info("root");
        logger.info(str);
        return str;
    }

    @PostMapping(value = "/pacs", produces= TEXT_PLAIN_VALUE, consumes= TEXT_PLAIN_VALUE)
    public MxPacs00800109  pacs008001009 (@RequestBody MxPacs00800109 mxPacs00800109)  {
        logger.info("pacs008001009");

        return mxPacs00800109;
    }

    private static final Logger logger = LoggerFactory.getLogger(XmlController.class);

}
