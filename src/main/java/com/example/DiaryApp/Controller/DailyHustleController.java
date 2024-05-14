package com.example.DiaryApp.Controller;

import com.example.DiaryApp.Model.DailyHustle;
import com.example.DiaryApp.Repository.DailyHustleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping
@RestController
public class DailyHustleController {

    @Autowired
    DailyHustleRepo dailyHustleRepo;

    @PostMapping("/addEntry")
    public void addEntry(@RequestBody DailyHustle dailyHustle)
    {
        dailyHustleRepo.save(dailyHustle);
    }

    @GetMapping("/getEntry")
    public List<DailyHustle> getEntry(){
        return dailyHustleRepo.findAll();
    }

    @GetMapping("/getEntryById/{id}")
    public DailyHustle getEntryById(@PathVariable Integer id){

       return dailyHustleRepo.findById(id).orElse(null);

    }

    @PutMapping("/updateEntry")
    public void updateEntry(@RequestBody DailyHustle dailyHustle){

        //getting object by id
        DailyHustle data = dailyHustleRepo.findById(dailyHustle.getId()).orElse(null);
        System.out.println(data);

        //check if null
        if(data!=null)
        {
            //assigns the data  to the following DailyHustle pojo and Updates
            data.setDate(dailyHustle.getDate());
            data.setMood(dailyHustle.getMood());
            data.setContent(dailyHustle.getContent());

            dailyHustleRepo.save(data);
        }
    }

    @DeleteMapping("/deleteEntry/{id}")
    public void deleteEntry(@PathVariable Integer id){
        dailyHustleRepo.deleteById(id);
    }
}
