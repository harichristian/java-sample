package moba.config;

public interface IConfig {
	int getMaxChargingPriority(String operator, String sdc, String keyword);
	int getMaxFailedDaysBeforeUnsub(String operator, String sdc, String keyword);
	String getDefaultPushSchedule(String operator, String sdc, String keyword);
	int getDefaultPrice(String operator, String sdc, String keyword);
	int getMsIdle(String operator, String sdc, String keyword);
	int getMaxCharacter(String operator, String sdc, String keyword);
	int getScheduleTypeDays(String operator, String sdc, String keyword);
	int getScheduleTypeInterval(String operator, String sdc, String keyword);
	String getTime(String operator, String sdc, String keyword);
	int getRetryAfterSeconds(String operator, String sdc, String keyword);
	int getPrice(String operator, String sdc, String keyword);
	String getContentType(String operator, String sdc, String keyword);
	int getFirstContentId(String operator, String sdc, String keyword);
	String getContentCategory(String operator, String sdc, String keyword);
	String getContentLoopPattern(String operator, String sdc, String keyword);
}
