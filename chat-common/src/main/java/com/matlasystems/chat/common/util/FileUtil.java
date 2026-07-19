package com.matlasystems.chat.common.util;

import com.matlasystems.chat.common.constants.FileConstants;
import com.matlasystems.chat.common.exceptions.FileStorageException;

import java.io.File;
import java.util.Locale;
import java.util.Set;

/**
 * Utility methods for working with files.
 */
public final class FileUtil {

    private FileUtil() {
    }

    /**
     * Returns the file extension.
     */
    public static String getExtension(String filename) {

        if (StringUtil.isNullOrBlank(filename)) {

            throw new FileStorageException(
                    "Filename cannot be null or empty.");
        }

        int index = filename.lastIndexOf('.');

        if (index < 0) {

            throw new FileStorageException(
                    "File has no extension.");
        }

        return filename.substring(index + 1)
                .toLowerCase(Locale.ENGLISH);

    }

    /**
     * Returns the filename without extension.
     */
    public static String getBaseName(String filename) {

        if (StringUtil.isNullOrBlank(filename)) {

            throw new FileStorageException(
                    "Filename cannot be null.");
        }

        int index = filename.lastIndexOf('.');

        if (index < 0) {

            return filename;
        }

        return filename.substring(0, index);

    }

    /**
     * Checks whether the extension is allowed.
     */
    public static boolean hasAllowedExtension(

            String filename,
            Set<String> allowedExtensions) {

        String extension = getExtension(filename);

        return allowedExtensions.contains(extension);

    }

    /**
     * Validates image uploads.
     */
    public static void validateImage(

            String filename,
            long fileSize) {

        validateFileSize(
                fileSize,
                FileConstants.MAX_IMAGE_SIZE);

        if (!hasAllowedExtension(
                filename,
                FileConstants.IMAGE_EXTENSIONS)) {

            throw new FileStorageException(
                    "Unsupported image format.");
        }

    }

    /**
     * Validates document uploads.
     */
    public static void validateDocument(

            String filename,
            long fileSize) {

        validateFileSize(
                fileSize,
                FileConstants.MAX_DOCUMENT_SIZE);

        if (!hasAllowedExtension(
                filename,
                FileConstants.DOCUMENT_EXTENSIONS)) {

            throw new FileStorageException(
                    "Unsupported document format.");
        }

    }

    /**
     * Validates video uploads.
     */
    public static void validateVideo(

            String filename,
            long fileSize) {

        validateFileSize(
                fileSize,
                FileConstants.MAX_VIDEO_SIZE);

        if (!hasAllowedExtension(
                filename,
                FileConstants.VIDEO_EXTENSIONS)) {

            throw new FileStorageException(
                    "Unsupported video format.");
        }

    }

    /**
     * Validates generic file size.
     */
    public static void validateFileSize(

            long fileSize,
            long maxSize) {

        if (fileSize <= 0) {

            throw new FileStorageException(
                    "File is empty.");
        }

        if (fileSize > maxSize) {

            throw new FileStorageException(
                    "File exceeds maximum allowed size.");
        }

    }

    /**
     * Validates audio uploads.
     */
    public static void validateAudio(
            String filename,
            long fileSize) {

        validateFileSize(
                fileSize,
                FileConstants.MAX_AUDIO_SIZE);

        if (!hasAllowedExtension(
                filename,
                FileConstants.AUDIO_EXTENSIONS)) {

            throw new FileStorageException(
                    "Unsupported audio format.");
        }

    }

    /**
     * Returns true if the file exists.
     */
    public static boolean exists(String path) {

        if (StringUtil.isNullOrBlank(path)) {

            return false;
        }

        return new File(path).exists();

    }

    /**
     * Returns true if the path is a directory.
     */
    public static boolean isDirectory(String path) {

        if (StringUtil.isNullOrBlank(path)) {

            return false;
        }

        return new File(path).isDirectory();

    }

    /**
     * Returns file size.
     */
    public static long size(String path) {

        if (!exists(path)) {

            throw new FileStorageException(
                    "File does not exist.");
        }

        return new File(path).length();

    }

}