package com.matlasystems.chat.common.constants;

import java.util.Set;

/**
 * Centralizes all file-related constants used throughout
 * the MATLA Chat Platform.
 *
 * Includes:
 * - Upload limits
 * - Supported extensions
 * - Upload directories
 * - MIME types
 */
public final class FileConstants {

    private FileConstants() {
    }

    /* =====================================================
     * File Size Limits (Bytes)
     * ===================================================== */

    public static final long KB = 1024L;

    public static final long MB = KB * 1024L;

    public static final long GB = MB * 1024L;

    public static final long MAX_IMAGE_SIZE = 10 * MB;

    public static final long MAX_DOCUMENT_SIZE = 50 * MB;

    public static final long MAX_VIDEO_SIZE = 500 * MB;

    public static final long MAX_AUDIO_SIZE = 100 * MB;

    public static final long MAX_AVATAR_SIZE = 5 * MB;

    /* =====================================================
     * Supported Extensions
     * ===================================================== */

    public static final Set<String> IMAGE_EXTENSIONS = Set.of(
            "jpg",
            "jpeg",
            "png",
            "gif",
            "bmp",
            "webp"
    );

    public static final Set<String> DOCUMENT_EXTENSIONS = Set.of(
            "pdf",
            "doc",
            "docx",
            "xls",
            "xlsx",
            "ppt",
            "pptx",
            "txt",
            "csv"
    );

    public static final Set<String> VIDEO_EXTENSIONS = Set.of(
            "mp4",
            "avi",
            "mov",
            "wmv",
            "mkv",
            "webm"
    );

    public static final Set<String> AUDIO_EXTENSIONS = Set.of(
            "mp3",
            "wav",
            "aac",
            "ogg",
            "flac",
            "m4a"
    );

    /* =====================================================
     * Upload Directories
     * ===================================================== */

    public static final String UPLOAD_DIRECTORY =
            "uploads/";

    public static final String IMAGE_DIRECTORY =
            "uploads/images/";

    public static final String DOCUMENT_DIRECTORY =
            "uploads/documents/";

    public static final String VIDEO_DIRECTORY =
            "uploads/videos/";

    public static final String AUDIO_DIRECTORY =
            "uploads/audio/";

    public static final String AVATAR_DIRECTORY =
            "uploads/avatars/";

    /* =====================================================
     * Default File Names
     * ===================================================== */

    public static final String DEFAULT_AVATAR =
            "default-avatar.png";

    public static final String TEMP_FILE_PREFIX =
            "temp_";

    /* =====================================================
     * MIME Types
     * ===================================================== */

    public static final String MIME_IMAGE =
            "image/";

    public static final String MIME_VIDEO =
            "video/";

    public static final String MIME_AUDIO =
            "audio/";

    public static final String MIME_APPLICATION =
            "application/";

    /* =====================================================
     * Miscellaneous
     * ===================================================== */

    public static final int MAX_FILENAME_LENGTH = 255;

    public static final String FILE_SEPARATOR = "/";

}