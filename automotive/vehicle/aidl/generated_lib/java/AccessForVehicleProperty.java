/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * DO NOT EDIT MANUALLY!!!
 *
 * Generated by tools/generate_annotation_enums.py.
 */

// clang-format off

package android.hardware.automotive.vehicle;

import java.util.Map;

public final class AccessForVehicleProperty {

    public static final Map<Integer, Integer> values = Map.ofEntries(
        Map.entry(VehicleProperty.INFO_VIN, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.INFO_MAKE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.INFO_MODEL, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.INFO_MODEL_YEAR, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.INFO_FUEL_CAPACITY, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.INFO_FUEL_TYPE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.INFO_EV_BATTERY_CAPACITY, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.INFO_EV_CONNECTOR_TYPE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.INFO_FUEL_DOOR_LOCATION, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.INFO_EV_PORT_LOCATION, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.INFO_DRIVER_SEAT, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.INFO_EXTERIOR_DIMENSIONS, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.INFO_MULTI_EV_PORT_LOCATIONS, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.PERF_ODOMETER, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.PERF_VEHICLE_SPEED, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.PERF_VEHICLE_SPEED_DISPLAY, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.PERF_STEERING_ANGLE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.PERF_REAR_STEERING_ANGLE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.ENGINE_COOLANT_TEMP, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.ENGINE_OIL_LEVEL, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.ENGINE_OIL_TEMP, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.ENGINE_RPM, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.WHEEL_TICK, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.FUEL_LEVEL, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.FUEL_DOOR_OPEN, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.EV_BATTERY_LEVEL, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.EV_CURRENT_BATTERY_CAPACITY, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.EV_CHARGE_PORT_OPEN, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.EV_CHARGE_PORT_CONNECTED, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.EV_BATTERY_INSTANTANEOUS_CHARGE_RATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.RANGE_REMAINING, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.TIRE_PRESSURE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.CRITICALLY_LOW_TIRE_PRESSURE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.ENGINE_IDLE_AUTO_STOP_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.GEAR_SELECTION, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.CURRENT_GEAR, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.PARKING_BRAKE_ON, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.PARKING_BRAKE_AUTO_APPLY, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.EV_BRAKE_REGENERATION_LEVEL, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.FUEL_LEVEL_LOW, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.NIGHT_MODE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.TURN_SIGNAL_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.IGNITION_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.ABS_ACTIVE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.TRACTION_CONTROL_ACTIVE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.EV_STOPPING_MODE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_FAN_SPEED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_FAN_DIRECTION, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_TEMPERATURE_CURRENT, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.HVAC_TEMPERATURE_SET, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_DEFROSTER, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_AC_ON, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_MAX_AC_ON, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_MAX_DEFROST_ON, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_RECIRC_ON, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_DUAL_ON, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_AUTO_ON, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_SEAT_TEMPERATURE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_SIDE_MIRROR_HEAT, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_STEERING_WHEEL_HEAT, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_TEMPERATURE_DISPLAY_UNITS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_ACTUAL_FAN_SPEED_RPM, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.HVAC_POWER_ON, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_FAN_DIRECTION_AVAILABLE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.HVAC_AUTO_RECIRC_ON, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_SEAT_VENTILATION, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_ELECTRIC_DEFROSTER_ON, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HVAC_TEMPERATURE_VALUE_SUGGESTION, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.DISTANCE_DISPLAY_UNITS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.FUEL_VOLUME_DISPLAY_UNITS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.TIRE_PRESSURE_DISPLAY_UNITS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.EV_BATTERY_DISPLAY_UNITS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.FUEL_CONSUMPTION_UNITS_DISTANCE_OVER_VOLUME, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.VEHICLE_SPEED_DISPLAY_UNITS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.EXTERNAL_CAR_TIME, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.ANDROID_EPOCH_TIME, VehiclePropertyAccess.WRITE),
        Map.entry(VehicleProperty.STORAGE_ENCRYPTION_BINDING_SEED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.ENV_OUTSIDE_TEMPERATURE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.AP_POWER_STATE_REQ, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.AP_POWER_STATE_REPORT, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.AP_POWER_BOOTUP_REASON, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.DISPLAY_BRIGHTNESS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.PER_DISPLAY_BRIGHTNESS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HW_KEY_INPUT, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.HW_KEY_INPUT_V2, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.HW_MOTION_INPUT, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.HW_ROTARY_INPUT, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.HW_CUSTOM_INPUT, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.DOOR_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.DOOR_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.DOOR_LOCK, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.DOOR_CHILD_LOCK_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.MIRROR_Z_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.MIRROR_Z_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.MIRROR_Y_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.MIRROR_Y_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.MIRROR_LOCK, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.MIRROR_FOLD, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.MIRROR_AUTO_FOLD_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.MIRROR_AUTO_TILT_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_MEMORY_SELECT, VehiclePropertyAccess.WRITE),
        Map.entry(VehicleProperty.SEAT_MEMORY_SET, VehiclePropertyAccess.WRITE),
        Map.entry(VehicleProperty.SEAT_BELT_BUCKLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_BELT_HEIGHT_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_BELT_HEIGHT_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_FORE_AFT_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_FORE_AFT_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_BACKREST_ANGLE_1_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_BACKREST_ANGLE_1_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_BACKREST_ANGLE_2_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_BACKREST_ANGLE_2_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_HEIGHT_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_HEIGHT_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_DEPTH_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_DEPTH_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_TILT_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_TILT_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_LUMBAR_FORE_AFT_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_LUMBAR_FORE_AFT_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_LUMBAR_SIDE_SUPPORT_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_LUMBAR_SIDE_SUPPORT_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_HEADREST_HEIGHT_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_HEADREST_HEIGHT_POS_V2, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_HEADREST_HEIGHT_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_HEADREST_ANGLE_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_HEADREST_ANGLE_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_HEADREST_FORE_AFT_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_HEADREST_FORE_AFT_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_FOOTWELL_LIGHTS_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.SEAT_FOOTWELL_LIGHTS_SWITCH, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_EASY_ACCESS_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_AIRBAG_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_AIRBAGS_DEPLOYED, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.SEAT_CUSHION_SIDE_SUPPORT_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_CUSHION_SIDE_SUPPORT_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_LUMBAR_VERTICAL_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_LUMBAR_VERTICAL_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_WALK_IN_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SEAT_OCCUPANCY, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.WINDOW_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.WINDOW_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.WINDOW_LOCK, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.WINDSHIELD_WIPERS_PERIOD, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.WINDSHIELD_WIPERS_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.WINDSHIELD_WIPERS_SWITCH, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.STEERING_WHEEL_DEPTH_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.STEERING_WHEEL_DEPTH_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.STEERING_WHEEL_HEIGHT_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.STEERING_WHEEL_HEIGHT_MOVE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.STEERING_WHEEL_THEFT_LOCK_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.STEERING_WHEEL_LOCKED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.STEERING_WHEEL_EASY_ACCESS_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.GLOVE_BOX_DOOR_POS, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.GLOVE_BOX_LOCKED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.VEHICLE_MAP_SERVICE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.LOCATION_CHARACTERIZATION, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.OBD2_LIVE_FRAME, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.OBD2_FREEZE_FRAME, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.OBD2_FREEZE_FRAME_INFO, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.OBD2_FREEZE_FRAME_CLEAR, VehiclePropertyAccess.WRITE),
        Map.entry(VehicleProperty.HEADLIGHTS_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.HIGH_BEAM_LIGHTS_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.FOG_LIGHTS_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.HAZARD_LIGHTS_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.HEADLIGHTS_SWITCH, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HIGH_BEAM_LIGHTS_SWITCH, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.FOG_LIGHTS_SWITCH, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HAZARD_LIGHTS_SWITCH, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.CABIN_LIGHTS_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.CABIN_LIGHTS_SWITCH, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.READING_LIGHTS_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.READING_LIGHTS_SWITCH, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.STEERING_WHEEL_LIGHTS_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.STEERING_WHEEL_LIGHTS_SWITCH, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SUPPORT_CUSTOMIZE_VENDOR_PERMISSION, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.DISABLED_OPTIONAL_FEATURES, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.INITIAL_USER_INFO, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.SWITCH_USER, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.CREATE_USER, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.REMOVE_USER, VehiclePropertyAccess.WRITE),
        Map.entry(VehicleProperty.USER_IDENTIFICATION_ASSOCIATION, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.EVS_SERVICE_REQUEST, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.POWER_POLICY_REQ, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.POWER_POLICY_GROUP_REQ, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.CURRENT_POWER_POLICY, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.WATCHDOG_ALIVE, VehiclePropertyAccess.WRITE),
        Map.entry(VehicleProperty.WATCHDOG_TERMINATED_PROCESS, VehiclePropertyAccess.WRITE),
        Map.entry(VehicleProperty.VHAL_HEARTBEAT, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.CLUSTER_SWITCH_UI, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.CLUSTER_DISPLAY_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.CLUSTER_REPORT_STATE, VehiclePropertyAccess.WRITE),
        Map.entry(VehicleProperty.CLUSTER_REQUEST_DISPLAY, VehiclePropertyAccess.WRITE),
        Map.entry(VehicleProperty.CLUSTER_NAVIGATION_STATE, VehiclePropertyAccess.WRITE),
        Map.entry(VehicleProperty.ELECTRONIC_TOLL_COLLECTION_CARD_TYPE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.ELECTRONIC_TOLL_COLLECTION_CARD_STATUS, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.FRONT_FOG_LIGHTS_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.FRONT_FOG_LIGHTS_SWITCH, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.REAR_FOG_LIGHTS_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.REAR_FOG_LIGHTS_SWITCH, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.EV_CHARGE_CURRENT_DRAW_LIMIT, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.EV_CHARGE_PERCENT_LIMIT, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.EV_CHARGE_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.EV_CHARGE_SWITCH, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.EV_CHARGE_TIME_REMAINING, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.EV_REGENERATIVE_BRAKING_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.TRAILER_PRESENT, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.VEHICLE_CURB_WEIGHT, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.GENERAL_SAFETY_REGULATION_COMPLIANCE_REQUIREMENT, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.SUPPORTED_PROPERTY_IDS, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.SHUTDOWN_REQUEST, VehiclePropertyAccess.WRITE),
        Map.entry(VehicleProperty.VEHICLE_IN_USE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.CLUSTER_HEARTBEAT, VehiclePropertyAccess.WRITE),
        Map.entry(VehicleProperty.VEHICLE_DRIVING_AUTOMATION_CURRENT_LEVEL, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.AUTOMATIC_EMERGENCY_BRAKING_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.AUTOMATIC_EMERGENCY_BRAKING_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.FORWARD_COLLISION_WARNING_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.FORWARD_COLLISION_WARNING_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.BLIND_SPOT_WARNING_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.BLIND_SPOT_WARNING_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.LANE_DEPARTURE_WARNING_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.LANE_DEPARTURE_WARNING_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.LANE_KEEP_ASSIST_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.LANE_KEEP_ASSIST_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.LANE_CENTERING_ASSIST_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.LANE_CENTERING_ASSIST_COMMAND, VehiclePropertyAccess.WRITE),
        Map.entry(VehicleProperty.LANE_CENTERING_ASSIST_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.EMERGENCY_LANE_KEEP_ASSIST_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.EMERGENCY_LANE_KEEP_ASSIST_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.CRUISE_CONTROL_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.CRUISE_CONTROL_TYPE, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.CRUISE_CONTROL_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.CRUISE_CONTROL_COMMAND, VehiclePropertyAccess.WRITE),
        Map.entry(VehicleProperty.CRUISE_CONTROL_TARGET_SPEED, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.ADAPTIVE_CRUISE_CONTROL_TARGET_TIME_GAP, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.ADAPTIVE_CRUISE_CONTROL_LEAD_VEHICLE_MEASURED_DISTANCE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.HANDS_ON_DETECTION_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.HANDS_ON_DETECTION_DRIVER_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.HANDS_ON_DETECTION_WARNING, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.DRIVER_DROWSINESS_ATTENTION_SYSTEM_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.DRIVER_DROWSINESS_ATTENTION_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.DRIVER_DROWSINESS_ATTENTION_WARNING_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.DRIVER_DROWSINESS_ATTENTION_WARNING, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.DRIVER_DISTRACTION_SYSTEM_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.DRIVER_DISTRACTION_STATE, VehiclePropertyAccess.READ),
        Map.entry(VehicleProperty.DRIVER_DISTRACTION_WARNING_ENABLED, VehiclePropertyAccess.READ_WRITE),
        Map.entry(VehicleProperty.DRIVER_DISTRACTION_WARNING, VehiclePropertyAccess.READ)
    );

}
