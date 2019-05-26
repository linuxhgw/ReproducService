package edu.jhun.Service.Test;

import edu.jhun.Service.Analysis.BaseAnalysisService;
import edu.jhun.Service.Analysis.TimeDomainAnalysisService;
import edu.jhun.Service.Scheme.DateService;
import edu.jhun.Service.Scheme.MumberService;
import edu.jhun.Service.Scheme.SchemeService;
import edu.jhun.bean.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by hgw on 2019/5/25.
 */
@Component
public class Hystrix implements TestService
        ,DateService,MumberService,SchemeService,
        BaseAnalysisService,TimeDomainAnalysisService {
    @Override
    public String add(String message) {
        return null;
    }

    @Override
    public int jiafa(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
        return a;
    }

    @Override
    public int[] getSchemeRunTime(int schemeId) {
        return new int[0];
    }

    @Override
    public List<OutValue> getDate(String atrr) {
        return null;
    }

    @Override
    public BaseIndex getBaseAnalysis(String atrr) {
        return null;
    }

    @Override
    public List<Mumber> getMumber(int schemeId) {
        return null;
    }

    @Override
    public TimeDomainIndex getTimeDomainAnalysis(String atrr) {
        return null;
    }

    @Override
    public List<Scheme> getSchemeList() {
        return null;
    }

    @Override
    public SchemeMessage getSchemeMessage(int schemeId) {
        return null;
    }
}
