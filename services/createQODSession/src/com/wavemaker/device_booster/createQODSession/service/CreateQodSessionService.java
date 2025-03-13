package com.wavemaker.device_booster.createQODSession.service;


import com.wavemaker.device_booster.createQODSession.model.*;
import com.wavemaker.device_booster.createQODSession.model.RootRequest;
import com.wavemaker.device_booster.createQODSession.model.RootResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface CreateQodSessionService {

  /**
   * 
   * 
    * @param body RequestBody (optional)
   * @return RootResponse
   */
  @RequestLine("POST /NACServices/services/device/qod")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  RootResponse invoke(RootRequest body);

}
