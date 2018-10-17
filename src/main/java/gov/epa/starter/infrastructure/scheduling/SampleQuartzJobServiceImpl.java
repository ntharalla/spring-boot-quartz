package gov.epa.starter.infrastructure.scheduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SampleQuartzJobServiceImpl implements SampleQuartzJobService {

	public static Logger logger = LoggerFactory.getLogger(SampleQuartzJobServiceImpl.class);
	@Override
	public void executeSampleJob() {
		 logger.info("The sample quartz job has begun...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            logger.error("Error while executing sample quartz job", e);
        } finally {
            logger.info("Sample quartz job has finished...");
        }
	}

}
