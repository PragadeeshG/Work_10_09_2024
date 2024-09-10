create table if not exists impact_notification(
notification_type varchar(255) not null,
source_application varchar(255) null,
source_dataset varchar(255) null,
all_ds_applicable varchar(255) null,
ds_name varchar(255) null,
ds_screen_id varchar(255) null,
notification_medium varchar(255) null,
max_allowed_notification Integer null,
follow_up_required varchar(255) null,
main_event_type varchar(255) null,
entity_state varchar(255) null,
constraint impact_notification_pk primary key(notification_type));